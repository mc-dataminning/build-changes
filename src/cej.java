public class cej extends cds {
   private int f = 200;

   public cej(bkm<? extends cej> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cej(crs $$0, bky $$1) {
      super(bkm.aR, $$1, $$0);
   }

   public cej(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B && !this.b) {
         this.dL().a(js.N, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected clb w() {
      return new clb(cle.uw);
   }

   @Override
   protected void a(bky $$0) {
      super.a($$0);
      bjv $$1 = new bjv(bjx.x, this.f, 0);
      $$0.b($$1, this.G());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
