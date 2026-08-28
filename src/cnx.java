public abstract class cnx extends cnp {
   protected cnx(bsx<? extends cnx> $$0, dcw $$1) {
      super($$0, $$1);
   }

   protected cnx(bsx<? extends cnx> $$0, double $$1, double $$2, double $$3, dcw $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cnx(bsx<? extends cnx> $$0, btn $$1, dcw $$2) {
      this($$0, $$1.du(), $$1.dy() - 0.1F, $$1.dA(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public boolean cx() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      ewy $$0 = cnr.a(this, this::b);
      if ($$0.c() != ewy.a.a) {
         this.b($$0);
      }

      this.aT();
      exa $$1 = this.ds();
      double $$2 = this.du() + $$1.c;
      double $$3 = this.dw() + $$1.d;
      double $$4 = this.dA() + $$1.e;
      this.I();
      float $$7;
      if (this.bf()) {
         for (int $$5 = 0; $$5 < 4; $$5++) {
            float $$6 = 0.25F;
            this.dP().a(lm.d, $$2 - $$1.c * 0.25, $$3 - $$1.d * 0.25, $$4 - $$1.e * 0.25, $$1.c, $$1.d, $$1.e);
         }

         $$7 = 0.8F;
      } else {
         $$7 = 0.99F;
      }

      this.i($$1.a((double)$$7));
      this.bb();
      this.a_($$2, $$3, $$4);
   }

   @Override
   protected double aZ() {
      return 0.03;
   }
}
