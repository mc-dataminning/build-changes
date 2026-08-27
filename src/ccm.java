public class ccm extends cbv {
   private int f = 200;

   public ccm(bip<? extends ccm> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccm(cpq $$0, bjb $$1) {
      super(bip.aR, $$1, $$0);
   }

   public ccm(cpq $$0, double $$1, double $$2, double $$3) {
      super(bip.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B && !this.b) {
         this.dK().a(ix.N, this.dp(), this.dr(), this.dv(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected cja p() {
      return new cja(cjd.uv);
   }

   @Override
   protected void a(bjb $$0) {
      super.a($$0);
      bhy $$1 = new bhy(bia.x, this.f, 0);
      $$0.b($$1, this.A());
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
