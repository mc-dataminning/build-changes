public abstract class cck extends ccd {
   protected cck(bik<? extends cck> $$0, cpk $$1) {
      super($$0, $$1);
   }

   protected cck(bik<? extends cck> $$0, double $$1, double $$2, double $$3, cpk $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected cck(bik<? extends cck> $$0, biw $$1, cpk $$2) {
      this($$0, $$1.dp(), $$1.dt() - 0.1F, $$1.dv(), $$2);
      this.b((big)$$1);
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
      ehd $$0 = cce.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == ehd.a.b) {
         gv $$2 = ((ehb)$$0).a();
         dey $$3 = this.dK().a_($$2);
         if ($$3.a(csl.ee)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(csl.kF)) {
            dck $$4 = this.dK().c_($$2);
            if ($$4 instanceof ddy && ddy.a(this)) {
               ddy.a(this.dK(), $$2, $$3, this, (ddy)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ehd.a.a && !$$1) {
         this.a($$0);
      }

      this.aO();
      ehf $$5 = this.dn();
      double $$6 = this.dp() + $$5.c;
      double $$7 = this.dr() + $$5.d;
      double $$8 = this.dv() + $$5.e;
      this.B();
      float $$11;
      if (this.aX()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dK().a(iw.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.f($$5.a((double)$$11));
      if (!this.aT()) {
         ehf $$13 = this.dn();
         this.o($$13.c, $$13.d - (double)this.p(), $$13.e);
      }

      this.e($$6, $$7, $$8);
   }

   protected float p() {
      return 0.03F;
   }
}
