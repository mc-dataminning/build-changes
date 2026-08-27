public enum dlr {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dlr(boolean $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dlr a(amb $$0) {
      if ($$0.a(amb.d)) {
         return c;
      } else {
         return $$0.a(amb.b) ? b : a;
      }
   }
}
