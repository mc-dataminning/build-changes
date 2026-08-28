public record bmf<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bmf<T> a(String $$0) {
      return new bmf<>($$0);
   }
}
