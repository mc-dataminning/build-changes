public class cdu extends cdd {
   private int f = 200;

   public cdu(bjx<? extends cdu> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdu(cqz $$0, bkj $$1) {
      super(bjx.aR, $$1, $$0);
   }

   public cdu(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B && !this.b) {
         this.dL().a(js.N, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected ckj w() {
      return new ckj(ckm.uv);
   }

   @Override
   protected void a(bkj $$0) {
      super.a($$0);
      bjg $$1 = new bjg(bji.x, this.f, 0);
      $$0.b($$1, this.G());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
