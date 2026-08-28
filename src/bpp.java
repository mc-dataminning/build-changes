public record bpp<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bpp<T> a(String $$0) {
      return new bpp<>($$0);
   }
}
