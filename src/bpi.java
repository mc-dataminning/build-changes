public record bpi<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bpi<T> a(String $$0) {
      return new bpi<>($$0);
   }
}
