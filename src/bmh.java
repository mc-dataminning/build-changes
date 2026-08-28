public record bmh<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bmh<T> a(String $$0) {
      return new bmh<>($$0);
   }
}
