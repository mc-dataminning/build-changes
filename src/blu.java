public record blu<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> blu<T> a(String $$0) {
      return new blu<>($$0);
   }
}
