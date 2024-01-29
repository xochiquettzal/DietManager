package model;

public class Meal {
    private int id;
    private String name;
    private double calories;
    // Diğer özellikler eklenebilir

    public Meal(int id, String name, double calories) {
        this.id = id;
        this.name = name;
        this.calories = calories;
    }

    // Getter ve setter metotları

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }
}
