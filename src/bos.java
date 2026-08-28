public record bos<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bos<T> a(String $$0) {
      return new bos<>($$0);
   }
}
