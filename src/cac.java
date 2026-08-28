public class cac extends cbb {
   private final cfj g;

   public cac(cfj $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.gq() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(dcc $$0, iz $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dsd $$2 = $$0.a_($$1);
         if ($$2.a(dfc.cv)) {
            return dpp.a($$0, $$1) < 1;
         } else {
            return $$2.a(dfc.cD) && $$2.c(dih.b) ? true : $$2.a(awp.R, $$0x -> $$0x.d(det.b).map($$0xx -> $$0xx != dsq.a).orElse(true));
         }
      }
   }
}
