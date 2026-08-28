public record bmi<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bmi<T> a(String $$0) {
      return new bmi<>($$0);
   }
}
