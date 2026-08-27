public class cgn extends cfw {
   private static final cng f = new cng(cnj.vl);
   private int g = 200;

   public cgn(bmc<? extends cgn> $$0, ctx $$1) {
      super($$0, $$1, f);
   }

   public cgn(ctx $$0, bmo $$1, cng $$2) {
      super(bmc.aT, $$1, $$0, $$2);
   }

   public cgn(ctx $$0, double $$1, double $$2, double $$3, cng $$4) {
      super(bmc.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B && !this.b) {
         this.dL().a(jx.P, this.dq(), this.ds(), this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bmo $$0) {
      super.a($$0);
      blj $$1 = new blj(bll.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
