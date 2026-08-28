public record bnt<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bnt<T> a(String $$0) {
      return new bnt<>($$0);
   }
}
