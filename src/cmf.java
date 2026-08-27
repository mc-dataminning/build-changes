public class cmf extends cln {
   private int g = 200;

   public cmf(brn<? extends cmf> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmf(dad $$0, bsa $$1, csz $$2) {
      super(brn.aU, $$1, $$0, $$2);
   }

   public cmf(dad $$0, double $$1, double $$2, double $$3, csz $$4) {
      super(brn.aU, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B && !this.b) {
         this.dN().a(kx.P, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bsa $$0) {
      super.a($$0);
      bqt $$1 = new bqt(bqv.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }

   @Override
   protected csz x() {
      return new csz(ctc.vp);
   }
}
