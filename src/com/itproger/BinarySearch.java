package com.itproger;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int [] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i] + " ");
        }

        System.out.println("");
        System.out.println("Введите число от 1 до " + numbers.length);
        int searchNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < numbers.length; i++) {

            if(searchNumber == numbers[i]) {
                System.out.println("Попытка номер - " + (i+1));
                System.out.println("Ура! найдено заданное число " + searchNumber);
                break;
            }
        }

        System.out.println("Бинарный поиск");
        int first = numbers[0];
        int last = numbers[numbers.length-1];
        int middle;
        int j = 0;
        do {
            middle = (first + last)/2;
            System.out.print("Попытка номер - " + (j+1));
            System.out.print(", first - " + (first));
            System.out.print(", last - " + (last));
            System.out.println(", midlle - " + (middle));


            if (middle == searchNumber){
                System.out.println("Ура! найдено заданное число " + searchNumber);
            } else if (searchNumber < middle) {
                last = middle;
            } else {
                first = middle;
            }
            j++;

        } while (searchNumber != middle);
    }
}
