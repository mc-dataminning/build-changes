public abstract class cpo extends cpg {
   private static final float b = 12.25F;

   protected cpo(bul<? extends cpo> $$0, dfb $$1) {
      super($$0, $$1);
   }

   protected cpo(bul<? extends cpo> $$0, double $$1, double $$2, double $$3, dfb $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.ag < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cS().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   @Override
   public boolean o(boolean $$0) {
      return true;
   }

   @Override
   public void l() {
      ezl $$0 = cpi.a(this, this::b);
      ezn $$1;
      if ($$0.d() != ezl.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.dv().e(this.dA());
      }

      this.b($$1);
      this.F();
      this.aL();
      super.l();
      if ($$0.d() != ezl.a.a && this.bM()) {
         this.b($$0);
      }

      this.o();
      this.bg();
   }

   private void o() {
      ezn $$0 = this.dA();
      ezn $$1 = this.dv();
      float $$4;
      if (this.bk()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dX().a(lr.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.h($$0.c((double)$$4));
   }

   @Override
   protected double be() {
      return 0.03;
   }
}
