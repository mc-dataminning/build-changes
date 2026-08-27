public class cmr extends cms {
   public cmr(bsb<? extends cmr> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmr(dca $$0, cgl $$1) {
      this(bsb.ap, $$0);
      this.c($$1);
      this.a_(
         $$1.dz() - (double)($$1.do() + 1.0F) * 0.5 * (double)aym.a($$1.bj * (float) (Math.PI / 180.0)),
         $$1.dD() - 0.1F,
         $$1.dF() + (double)($$1.do() + 1.0F) * 0.5 * (double)aym.b($$1.bj * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bc() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      ewu $$0 = this.dx();
      ews $$1 = cmu.a(this, this::b);
      this.a($$1);
      double $$2 = this.dz() + $$0.c;
      double $$3 = this.dB() + $$0.d;
      double $$4 = this.dF() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      if (this.dU().a(this.cP()).noneMatch(dtb.a::i)) {
         this.ao();
      } else if (this.bl()) {
         this.ao();
      } else {
         this.g($$0.a(0.99F));
         this.be();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      if (this.t() instanceof bso $$1) {
         $$0.a().a(this.dX().b(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ewq $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.ao();
      }
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dU().a(lb.af, this.dz(), this.dB(), this.dF(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
