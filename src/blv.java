public record blv<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> blv<T> a(String $$0) {
      return new blv<>($$0);
   }
}
