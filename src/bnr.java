public record bnr<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bnr<T> a(String $$0) {
      return new bnr<>($$0);
   }
}
