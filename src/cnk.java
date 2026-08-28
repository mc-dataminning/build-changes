public abstract class cnk extends cnc {
   protected cnk(bsm<? extends cnk> $$0, dcf $$1) {
      super($$0, $$1);
   }

   protected cnk(bsm<? extends cnk> $$0, double $$1, double $$2, double $$3, dcf $$4) {
      this($$0, $$4);
      this.a_($$1, $$2, $$3);
   }

   protected cnk(bsm<? extends cnk> $$0, btb $$1, dcf $$2) {
      this($$0, $$1.dv(), $$1.dz() - 0.1F, $$1.dB(), $$2);
      this.c($$1);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      super.l();
      ewd $$0 = cne.a(this, this::b);
      boolean $$1 = false;
      if ($$0.c() == ewd.a.b) {
         ja $$2 = ((ewb)$$0).a();
         dsk $$3 = this.dQ().a_($$2);
         if ($$3.a(dfj.ed)) {
            this.f($$2);
            $$1 = true;
         } else if ($$3.a(dfj.kF)) {
            dpp $$4 = this.dQ().c_($$2);
            if ($$4 instanceof drg && drg.a(this)) {
               drg.a(this.dQ(), $$2, $$3, this, (drg)$$4);
            }

            $$1 = true;
         }
      }

      if ($$0.c() != ewd.a.a && !$$1) {
         this.b($$0);
      }

      this.aT();
      ewf $$5 = this.dt();
      double $$6 = this.dv() + $$5.c;
      double $$7 = this.dx() + $$5.d;
      double $$8 = this.dB() + $$5.e;
      this.J();
      float $$11;
      if (this.bf()) {
         for (int $$9 = 0; $$9 < 4; $$9++) {
            float $$10 = 0.25F;
            this.dQ().a(lj.d, $$6 - $$5.c * 0.25, $$7 - $$5.d * 0.25, $$8 - $$5.e * 0.25, $$5.c, $$5.d, $$5.e);
         }

         $$11 = 0.8F;
      } else {
         $$11 = 0.99F;
      }

      this.i($$5.a((double)$$11));
      this.bb();
      this.a_($$6, $$7, $$8);
   }

   @Override
   protected double aZ() {
      return 0.03;
   }
}
