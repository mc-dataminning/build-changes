public record bmy<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bmy<T> a(String $$0) {
      return new bmy<>($$0);
   }
}
