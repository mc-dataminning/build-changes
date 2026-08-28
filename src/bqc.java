public record bqc<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bqc<T> a(String $$0) {
      return new bqc<>($$0);
   }
}
