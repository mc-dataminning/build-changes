public record bpn<T>(String a) {
   @Override
   public String toString() {
      return "<" + this.a + ">";
   }

   public static <T> bpn<T> a(String $$0) {
      return new bpn<>($$0);
   }
}
