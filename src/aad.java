public enum aad {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private aad(final String $$0) {
      this.c = $$0;
   }

   public aad a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
