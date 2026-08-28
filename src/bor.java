public record bor<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bor<T> a(String $$0) {
      return new bor<>($$0);
   }
}
