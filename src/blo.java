public record blo<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> blo<T> a(String $$0) {
      return new blo<>($$0);
   }
}
