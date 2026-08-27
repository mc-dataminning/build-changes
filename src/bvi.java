public class bvi extends bwh {
   private final cap g;

   public bvi(cap $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.gl() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(cwh $$0, ib $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dme $$2 = $$0.a_($$1);
         if ($$2.a(czh.cv)) {
            return djs.a($$0, $$1) < 1;
         } else {
            return $$2.a(czh.cD) && $$2.c(dcm.b) ? true : $$2.a(aue.R, $$0x -> $$0x.d(cyy.b).map($$0xx -> $$0xx != dmr.a).orElse(true));
         }
      }
   }
}
