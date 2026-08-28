public class ceg extends cff {
   private final cjp g;

   public ceg(cjp $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gu() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(dkc $$0, iw $$1) {
      if (!$$0.v($$1.d())) {
         return false;
      } else {
         ebg $$2 = $$0.a_($$1);
         if ($$2.a(dng.cG)) {
            return dym.a($$0, $$1) < 1;
         } else {
            return $$2.a(dng.cO) && $$2.c(dqp.b) ? true : $$2.a(axg.T, $$0x -> $$0x.d(dmx.b).map($$0xx -> $$0xx != ebt.a).orElse(true));
         }
      }
   }
}
