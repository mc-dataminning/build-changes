public abstract class cct extends ccm {
   protected cct(biu<? extends cct> $$0, cpv $$1) {
      super($$0, $$1);
   }

   protected cct(biu<? extends cct> $$0, double $$1, double $$2, double $$3, cpv $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected cct(biu<? extends cct> $$0, bjg $$1, cpv $$2) {
      this($$0, $$1.dq(), $$1.du() - 0.1F, $$1.dw(), $$2);
      this.b((biq)$$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      ehl $$0 = ccn.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == ehl.a.b) {
         gw $$2 = ((ehj)$$0).a();
         dfj $$3 = this.dL().a_($$2);
         if ($$3.a(csw.ee)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(csw.kF)) {
            dcv $$4 = this.dL().c_($$2);
            if ($$4 instanceof dej && dej.a(this)) {
               dej.a(this.dL(), $$2, $$3, this, (dej)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ehl.a.a && !$$1) {
         this.a($$0);
      }

      this.aP();
      ehn $$5 = this.do();
      double $$6 = this.dq() + $$5.c;
      double $$7 = this.ds() + $$5.d;
      double $$8 = this.dw() + $$5.e;
      this.H();
      float $$11;
      if (this.aY()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dL().a(ix.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.f($$5.a((double)$$11));
      if (!this.aU()) {
         ehn $$13 = this.do();
         this.o($$13.c, $$13.d - (double)this.w(), $$13.e);
      }

      this.e($$6, $$7, $$8);
   }

   protected float w() {
      return 0.03F;
   }
}
