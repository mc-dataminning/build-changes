public record bla<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bla<T> a(String $$0) {
      return new bla<>($$0);
   }
}
