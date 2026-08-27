public class ccx extends ccg {
   private int f = 200;

   public ccx(bja<? extends ccx> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ccx(cqb $$0, bjm $$1) {
      super(bja.aR, $$1, $$0);
   }

   public ccx(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B && !this.b) {
         this.dL().a(iv.N, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected cjl w() {
      return new cjl(cjo.uv);
   }

   @Override
   protected void a(bjm $$0) {
      super.a($$0);
      bij $$1 = new bij(bil.x, this.f, 0);
      $$0.b($$1, this.G());
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
