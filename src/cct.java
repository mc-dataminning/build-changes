public class cct extends ccc {
   private int f = 200;

   public cct(biw<? extends cct> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cct(cpx $$0, bji $$1) {
      super(biw.aR, $$1, $$0);
   }

   public cct(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B && !this.b) {
         this.dL().a(ix.N, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected cjh w() {
      return new cjh(cjk.uv);
   }

   @Override
   protected void a(bji $$0) {
      super.a($$0);
      bif $$1 = new bif(bih.x, this.f, 0);
      $$0.b($$1, this.G());
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
