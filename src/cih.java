public abstract class cih extends chz {
   protected cih(bnu<? extends cih> $$0, cvn $$1) {
      super($$0, $$1);
   }

   protected cih(bnu<? extends cih> $$0, double $$1, double $$2, double $$3, cvn $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cih(bnu<? extends cih> $$0, bog $$1, cvn $$2) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2);
      this.b((bno)$$1);
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
      enq $$0 = cib.a(this, this::a);
      boolean $$1 = false;
      if ($$0.c() == enq.a.b) {
         hz $$2 = ((eno)$$0).a();
         dlf $$3 = this.dM().a_($$2);
         if ($$3.a(cyq.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(cyq.kF)) {
            dit $$4 = this.dM().c_($$2);
            if ($$4 instanceof dki && dki.a(this)) {
               dki.a(this.dM(), $$2, $$3, this, (dki)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != enq.a.a && !$$1) {
         this.a($$0);
      }

      this.aQ();
      ens $$5 = this.dp();
      double $$6 = this.dr() + $$5.c;
      double $$7 = this.dt() + $$5.d;
      double $$8 = this.dx() + $$5.e;
      this.J();
      float $$11;
      if (this.aZ()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dM().a(jz.e, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.g($$5.a((double)$$11));
      if (!this.aV()) {
         ens $$13 = this.dp();
         this.o($$13.c, $$13.d - (double)this.x(), $$13.e);
      }

      this.a_($$6, $$7, $$8);
   }

   protected float x() {
      return 0.03F;
   }
}
