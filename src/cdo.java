public class cdo extends cen {
   private final cix g;

   public cdo(cix $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gr() && super.b();
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
   protected boolean a(djd $$0, iu $$1) {
      if (!$$0.v($$1.d())) {
         return false;
      } else {
         eah $$2 = $$0.a_($$1);
         if ($$2.a(dmh.cG)) {
            return dxn.a($$0, $$1) < 1;
         } else {
            return $$2.a(dmh.cO) && $$2.c(dpq.b) ? true : $$2.a(axc.T, $$0x -> $$0x.d(dly.b).map($$0xx -> $$0xx != eau.a).orElse(true));
         }
      }
   }
}
