public class cnm extends cnn {
   public cnm(bsw<? extends cnm> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cnm(dcu $$0, chj $$1) {
      this(bsw.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dv() - (double)($$1.dk() + 1.0F) * 0.5 * (double)ayn.a($$1.aY * (float) (Math.PI / 180.0)),
         $$1.dz() - 0.1F,
         $$1.dB() + (double)($$1.dk() + 1.0F) * 0.5 * (double)ayn.b($$1.aY * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double aZ() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      eww $$0 = this.dt();
      ewu $$1 = cnp.a(this, this::b);
      this.b($$1);
      double $$2 = this.dv() + $$0.c;
      double $$3 = this.dx() + $$0.d;
      double $$4 = this.dB() + $$0.e;
      this.K();
      float $$5 = 0.99F;
      if (this.dQ().a(this.cL()).noneMatch(dsz.a::i)) {
         this.aq();
      } else if (this.bi()) {
         this.aq();
      } else {
         this.i($$0.a(0.99F));
         this.bb();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      if (this.s() instanceof btl $$1) {
         bsq $$2 = $$0.a();
         brj $$3 = this.dR().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dQ() instanceof aqt $$4) {
            dac.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.aq();
      }
   }

   @Override
   protected void a(ajz.a $$0) {
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dQ().a(lm.ah, this.dv(), this.dx(), this.dB(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
