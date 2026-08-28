public class cnb extends cnc {
   public cnb(bsm<? extends cnb> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cnb(dcf $$0, cgy $$1) {
      this(bsm.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dv() - (double)($$1.dk() + 1.0F) * 0.5 * (double)ayg.a($$1.aY * (float) (Math.PI / 180.0)),
         $$1.dz() - 0.1F,
         $$1.dB() + (double)($$1.dk() + 1.0F) * 0.5 * (double)ayg.b($$1.aY * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double aZ() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      ewf $$0 = this.dt();
      ewd $$1 = cne.a(this, this::b);
      this.b($$1);
      double $$2 = this.dv() + $$0.c;
      double $$3 = this.dx() + $$0.d;
      double $$4 = this.dB() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      if (this.dQ().a(this.cL()).noneMatch(dsj.a::i)) {
         this.ap();
      } else if (this.bi()) {
         this.ap();
      } else {
         this.i($$0.a(0.99F));
         this.bb();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      if (this.s() instanceof btb $$1) {
         bsg $$2 = $$0.a();
         bqz $$3 = this.dR().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dQ() instanceof aqm $$4) {
            czn.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ewb $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.ap();
      }
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dQ().a(lj.ah, this.dv(), this.dx(), this.dB(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
