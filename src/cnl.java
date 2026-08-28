public abstract class cnl extends cnd {
   protected cnl(bsn<? extends cnl> $$0, dcg $$1) {
      super($$0, $$1);
   }

   protected cnl(bsn<? extends cnl> $$0, double $$1, double $$2, double $$3, dcg $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cnl(bsn<? extends cnl> $$0, btc $$1, dcg $$2) {
      this($$0, $$1.dw(), $$1.dA() - 0.1F, $$1.dC(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cM().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      ewf $$0 = cnf.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == ewf.a.b) {
         ja $$2 = ((ewd)$$0).a();
         dsl $$3 = this.dR().a_($$2);
         if ($$3.a(dfk.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(dfk.kF)) {
            dpq $$4 = this.dR().c_($$2);
            if ($$4 instanceof drh && drh.a(this)) {
               drh.a(this.dR(), $$2, $$3, this, (drh)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ewf.a.a && !$$1) {
         this.b($$0);
      }

      this.aU();
      ewh $$5 = this.du();
      double $$6 = this.dw() + $$5.c;
      double $$7 = this.dy() + $$5.d;
      double $$8 = this.dC() + $$5.e;
      this.J();
      float $$11;
      if (this.bg()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dR().a(lj.d, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.j($$5.a((double)$$11));
      this.bc();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double ba() {
      return 0.03;
   }
}
