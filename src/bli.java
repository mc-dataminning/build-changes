public record bli<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bli<T> a(String $$0) {
      return new bli<>($$0);
   }
}
