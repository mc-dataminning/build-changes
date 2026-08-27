public abstract class cel extends cee {
   protected cel(bkm<? extends cel> $$0, crs $$1) {
      super($$0, $$1);
   }

   protected cel(bkm<? extends cel> $$0, double $$1, double $$2, double $$3, crs $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected cel(bkm<? extends cel> $$0, bky $$1, crs $$2) {
      this($$0, $$1.dq(), $$1.du() - 0.1F, $$1.dw(), $$2);
      this.b((bki)$$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      ejg $$0 = cef.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == ejg.a.b) {
         ht $$2 = ((eje)$$0).a();
         dgw $$3 = this.dL().a_($$2);
         if ($$3.a(cuv.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(cuv.kF)) {
            der $$4 = this.dL().c_($$2);
            if ($$4 instanceof dgg && dgg.a(this)) {
               dgg.a(this.dL(), $$2, $$3, this, (dgg)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ejg.a.a && !$$1) {
         this.a($$0);
      }

      this.aO();
      eji $$5 = this.do();
      double $$6 = this.dq() + $$5.c;
      double $$7 = this.ds() + $$5.d;
      double $$8 = this.dw() + $$5.e;
      this.H();
      float $$11;
      if (this.aX()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dL().a(js.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.f($$5.a((double)$$11));
      if (!this.aT()) {
         eji $$13 = this.do();
         this.o($$13.c, $$13.d - (double)this.w(), $$13.e);
      }

      this.e($$6, $$7, $$8);
   }

   protected float w() {
      return 0.03F;
   }
}
