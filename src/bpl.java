public record bpl<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bpl<T> a(String $$0) {
      return new bpl<>($$0);
   }
}
