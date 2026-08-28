public record bnm<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bnm<T> a(String $$0) {
      return new bnm<>($$0);
   }
}
