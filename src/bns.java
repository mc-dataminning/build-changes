public record bns<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bns<T> a(String $$0) {
      return new bns<>($$0);
   }
}
