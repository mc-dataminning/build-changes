public record bon<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bon<T> a(String $$0) {
      return new bon<>($$0);
   }
}
