public record bmk<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bmk<T> a(String $$0) {
      return new bmk<>($$0);
   }
}
