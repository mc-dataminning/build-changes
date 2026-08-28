public class ccj extends cdi {
   private final chr g;

   public ccj(chr $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.p() && !this.g.go() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(dhc $$0, jh $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dxo $$2 = $$0.a_($$1);
         if ($$2.a(dkf.cD)) {
            return dux.a($$0, $$1) < 1;
         } else {
            return $$2.a(dkf.cL) && $$2.c(dnl.b) ? true : $$2.a(axk.T, $$0x -> $$0x.d(djw.b).map($$0xx -> $$0xx != dyb.a).orElse(true));
         }
      }
   }
}
