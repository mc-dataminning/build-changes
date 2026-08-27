public abstract class bzn extends bzg {
   protected bzn(bfn<? extends bzn> $$0, cmm $$1) {
      super($$0, $$1);
   }

   protected bzn(bfn<? extends bzn> $$0, double $$1, double $$2, double $$3, cmm $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected bzn(bfn<? extends bzn> $$0, bfz $$1, cmm $$2) {
      this($$0, $$1.dn(), $$1.dr() - 0.1F, $$1.dt(), $$2);
      this.b((bfj)$$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      eeg $$0 = bzh.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == eeg.a.b) {
         gu $$2 = ((eee)$$0).a();
         dcb $$3 = this.dI().a_($$2);
         if ($$3.a(cpo.ee)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(cpo.kF)) {
            czn $$4 = this.dI().c_($$2);
            if ($$4 instanceof dbb && dbb.a(this)) {
               dbb.a(this.dI(), $$2, $$3, this, (dbb)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != eeg.a.a && !$$1) {
         this.a($$0);
      }

      this.aM();
      eei $$5 = this.dl();
      double $$6 = this.dn() + $$5.c;
      double $$7 = this.dp() + $$5.d;
      double $$8 = this.dt() + $$5.e;
      this.C();
      float $$11;
      if (this.aV()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dI().a(iv.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.f($$5.a((double)$$11));
      if (!this.aR()) {
         eei $$13 = this.dl();
         this.o($$13.c, $$13.d - (double)this.p(), $$13.e);
      }

      this.e($$6, $$7, $$8);
   }

   protected float p() {
      return 0.03F;
   }
}
