public class ccr extends cca {
   private int f = 200;

   public ccr(biu<? extends ccr> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccr(cpv $$0, bjg $$1) {
      super(biu.aR, $$1, $$0);
   }

   public ccr(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B && !this.b) {
         this.dL().a(ix.N, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected cjf w() {
      return new cjf(cji.uv);
   }

   @Override
   protected void a(bjg $$0) {
      super.a($$0);
      bid $$1 = new bid(bif.x, this.f, 0);
      $$0.b($$1, this.G());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
