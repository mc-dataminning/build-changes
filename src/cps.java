public abstract class cps extends cpk {
   private static final float b = 12.25F;

   protected cps(bup<? extends cps> $$0, dff $$1) {
      super($$0, $$1);
   }

   protected cps(bup<? extends cps> $$0, double $$1, double $$2, double $$3, dff $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   @Override
   public boolean a(double $$0) {
      if (this.ag < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cT().a() * 4.0;
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
      ezp $$0 = cpm.a(this, this::b);
      ezr $$1;
      if ($$0.d() != ezp.a.a) {
         $$1 = $$0.g();
      } else {
         $$1 = this.dw().e(this.dB());
      }

      this.b($$1);
      this.F();
      this.aM();
      super.l();
      if ($$0.d() != ezp.a.a && this.bN()) {
         this.b($$0);
      }

      this.o();
      this.bh();
   }

   private void o() {
      ezr $$0 = this.dB();
      ezr $$1 = this.dw();
      float $$4;
      if (this.bl()) {
         for (int $$2 = 0; $$2 < 4; $$2++) {
            float $$3 = 0.25F;
            this.dY().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$4 = 0.8F;
      } else {
         $$4 = 0.99F;
      }

      this.h($$0.c((double)$$4));
   }

   @Override
   protected double bf() {
      return 0.03;
   }
}
