public abstract class cco extends cch {
   protected cco(bip<? extends cco> $$0, cpq $$1) {
      super($$0, $$1);
   }

   protected cco(bip<? extends cco> $$0, double $$1, double $$2, double $$3, cpq $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected cco(bip<? extends cco> $$0, bjb $$1, cpq $$2) {
      this($$0, $$1.dp(), $$1.dt() - 0.1F, $$1.dv(), $$2);
      this.b((bil)$$1);
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
      ehg $$0 = cci.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == ehg.a.b) {
         gw $$2 = ((ehe)$$0).a();
         dfe $$3 = this.dK().a_($$2);
         if ($$3.a(csr.ee)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(csr.kF)) {
            dcq $$4 = this.dK().c_($$2);
            if ($$4 instanceof dee && dee.a(this)) {
               dee.a(this.dK(), $$2, $$3, this, (dee)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ehg.a.a && !$$1) {
         this.a($$0);
      }

      this.aO();
      ehi $$5 = this.dn();
      double $$6 = this.dp() + $$5.c;
      double $$7 = this.dr() + $$5.d;
      double $$8 = this.dv() + $$5.e;
      this.B();
      float $$11;
      if (this.aX()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dK().a(ix.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.f($$5.a((double)$$11));
      if (!this.aT()) {
         ehi $$13 = this.dn();
         this.o($$13.c, $$13.d - (double)this.p(), $$13.e);
      }

      this.e($$6, $$7, $$8);
   }

   protected float p() {
      return 0.03F;
   }
}
