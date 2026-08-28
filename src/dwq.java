public enum dwq {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dwq(final boolean $$0, final boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dwq a(aqy $$0) {
      if ($$0.a(aqy.d)) {
         return c;
      } else {
         return $$0.a(aqy.b) ? b : a;
      }
   }
}
