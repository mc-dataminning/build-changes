public record bpr<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bpr<T> a(String $$0) {
      return new bpr<>($$0);
   }
}
