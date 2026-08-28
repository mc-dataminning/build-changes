public enum egk {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private egk(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static egk a(arp $$0) {
      if ($$0.a(arp.d)) {
         return c;
      } else {
         return $$0.a(arp.b) ? b : a;
      }
   }
}
