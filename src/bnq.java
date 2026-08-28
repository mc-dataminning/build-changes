public record bnq<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bnq<T> a(String $$0) {
      return new bnq<>($$0);
   }
}
