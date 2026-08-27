public enum dpj {
   a(false, false),
   b(true, false),
   c(true, true);

   private final boolean d;
   private final boolean e;

   private dpj(boolean $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public boolean a() {
      return this.e;
   }

   public boolean b() {
      return this.d;
   }

   public static dpj a(aoo $$0) {
      if ($$0.a(aoo.d)) {
         return c;
      } else {
         return $$0.a(aoo.b) ? b : a;
      }
   }
}
