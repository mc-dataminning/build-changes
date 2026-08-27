public class cij extends chr {
   private static final cpd g = new cpd(cpg.vl);
   private int h = 200;

   public cij(bnw<? extends cij> $$0, cvr $$1) {
      super($$0, $$1, g);
   }

   public cij(cvr $$0, boi $$1, cpd $$2) {
      super(bnw.aT, $$1, $$0, $$2);
   }

   public cij(cvr $$0, double $$1, double $$2, double $$3, cpd $$4) {
      super(bnw.aT, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(jz.P, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(boi $$0) {
      super.a($$0);
      bnd $$1 = new bnd(bnf.x, this.h, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.h = $$0.h("Duration");
      }
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Duration", this.h);
   }
}
