public abstract class cmw extends cmo {
   protected cmw(bsa<? extends cmw> $$0, dax $$1) {
      super($$0, $$1);
   }

   protected cmw(bsa<? extends cmw> $$0, double $$1, double $$2, double $$3, dax $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cmw(bsa<? extends cmw> $$0, bso $$1, dax $$2) {
      this($$0, $$1.du(), $$1.dy() - 0.1F, $$1.dA(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      eui $$0 = cmq.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == eui.a.b) {
         io $$2 = ((eug)$$0).a();
         drb $$3 = this.dP().a_($$2);
         if ($$3.a(dea.ed)) {
            this.g($$2);
            $$1 = true;
         } else if ($$3.a(dea.kF)) {
            dog $$4 = this.dP().c_($$2);
            if ($$4 instanceof dpw && dpw.a(this)) {
               dpw.a(this.dP(), $$2, $$3, this, (dpw)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != eui.a.a && !$$1) {
         this.a($$0);
      }

      this.aS();
      euk $$5 = this.ds();
      double $$6 = this.du() + $$5.c;
      double $$7 = this.dw() + $$5.d;
      double $$8 = this.dA() + $$5.e;
      this.J();
      float $$11;
      if (this.be()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dP().a(ky.d, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      this.ba();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double aY() {
      return 0.03;
   }
}
