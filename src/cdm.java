public class cdm extends cel {
   private final civ g;

   public cdm(civ $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gq() && super.b();
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
   protected boolean a(diy $$0, iu $$1) {
      if (!$$0.v($$1.d())) {
         return false;
      } else {
         dzz $$2 = $$0.a_($$1);
         if ($$2.a(dmc.cE)) {
            return dxf.a($$0, $$1) < 1;
         } else {
            return $$2.a(dmc.cM) && $$2.c(dpk.b) ? true : $$2.a(axc.T, $$0x -> $$0x.d(dlt.b).map($$0xx -> $$0xx != eam.a).orElse(true));
         }
      }
   }
}
