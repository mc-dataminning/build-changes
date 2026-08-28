public record bme<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bme<T> a(String $$0) {
      return new bme<>($$0);
   }
}
