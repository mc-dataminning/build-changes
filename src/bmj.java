public record bmj<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bmj<T> a(String $$0) {
      return new bmj<>($$0);
   }
}
