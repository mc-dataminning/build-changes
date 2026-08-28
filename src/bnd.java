public record bnd<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bnd<T> a(String $$0) {
      return new bnd<>($$0);
   }
}
