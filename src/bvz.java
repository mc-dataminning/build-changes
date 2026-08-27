public class bvz extends bwy {
   private final cbg g;

   public bvz(cbg $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gn() && super.a();
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
   protected boolean a(cxc $$0, ib $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dmz $$2 = $$0.a_($$1);
         if ($$2.a(dac.cv)) {
            return dkn.a($$0, $$1) < 1;
         } else {
            return $$2.a(dac.cD) && $$2.c(ddh.b) ? true : $$2.a(aun.R, $$0x -> $$0x.d(czt.b).map($$0xx -> $$0xx != dnm.a).orElse(true));
         }
      }
   }
}
