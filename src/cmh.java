public abstract class cmh extends clz {
   protected cmh(brn<? extends cmh> $$0, dad $$1) {
      super($$0, $$1);
   }

   protected cmh(brn<? extends cmh> $$0, double $$1, double $$2, double $$3, dad $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cmh(brn<? extends cmh> $$0, bsa $$1, dad $$2) {
      this($$0, $$1.ds(), $$1.dw() - 0.1F, $$1.dy(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cI().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      etn $$0 = cmb.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == etn.a.b) {
         in $$2 = ((etl)$$0).a();
         dqh $$3 = this.dN().a_($$2);
         if ($$3.a(ddg.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(ddg.kF)) {
            dnm $$4 = this.dN().c_($$2);
            if ($$4 instanceof dpc && dpc.a(this)) {
               dpc.a(this.dN(), $$2, $$3, this, (dpc)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != etn.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      etp $$5 = this.dq();
      double $$6 = this.ds() + $$5.c;
      double $$7 = this.du() + $$5.d;
      double $$8 = this.dy() + $$5.e;
      this.J();
      float $$11;
      if (this.bc()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dN().a(kx.d, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      this.aY();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double aW() {
      return 0.03;
   }
}
