public class ccj extends cbs {
   private int f = 200;

   public ccj(bim<? extends ccj> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public ccj(cpl $$0, biy $$1) {
      super(bim.aR, $$1, $$0);
   }

   public ccj(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B && !this.b) {
         this.dK().a(iv.N, this.dp(), this.dr(), this.dv(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected cix p() {
      return new cix(cja.uv);
   }

   @Override
   protected void a(biy $$0) {
      super.a($$0);
      bhv $$1 = new bhv(bhx.x, this.f, 0);
      $$0.b($$1, this.A());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
