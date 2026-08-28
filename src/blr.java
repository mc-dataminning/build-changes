public record blr<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> blr<T> a(String $$0) {
      return new blr<>($$0);
   }
}
