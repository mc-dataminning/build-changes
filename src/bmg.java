public record bmg<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bmg<T> a(String $$0) {
      return new bmg<>($$0);
   }
}
