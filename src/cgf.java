public class cgf extends cfo {
   private static final cmy f = new cmy(cnb.vi);
   private int g = 200;

   public cgf(blz<? extends cgf> $$0, ctp $$1) {
      super($$0, $$1, f);
   }

   public cgf(ctp $$0, bml $$1, cmy $$2) {
      super(blz.aS, $$1, $$0, $$2);
   }

   public cgf(ctp $$0, double $$1, double $$2, double $$3, cmy $$4) {
      super(blz.aS, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(jx.P, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bml $$0) {
      super.a($$0);
      bli $$1 = new bli(blk.x, this.g, 0);
      $$0.b($$1, this.J());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
