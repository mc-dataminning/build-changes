public record boi<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> boi<T> a(String $$0) {
      return new boi<>($$0);
   }
}
