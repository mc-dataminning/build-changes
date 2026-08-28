public record bng<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bng<T> a(String $$0) {
      return new bng<>($$0);
   }
}
