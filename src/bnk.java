public record bnk<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bnk<T> a(String $$0) {
      return new bnk<>($$0);
   }
}
