public enum dnt {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dnt(boolean $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dnt a(amx $$0) {
      if ($$0.a(amx.d)) {
         return c;
      } else {
         return $$0.a(amx.b) ? b : a;
      }
   }
}
