public record bpt<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bpt<T> a(String $$0) {
      return new bpt<>($$0);
   }
}
