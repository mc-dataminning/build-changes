public record bpa<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bpa<T> a(String $$0) {
      return new bpa<>($$0);
   }
}
