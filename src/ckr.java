public class ckr extends cks {
   public ckr(bqg<? extends ckr> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckr(czg $$0, cep $$1) {
      this(bqg.an, $$0);
      this.c($$1);
      this.a_(
         $$1.dr() - (double)($$1.dg() + 1.0F) * 0.5 * (double)axm.a($$1.aX * (float) (Math.PI / 180.0)),
         $$1.dv() - 0.1F,
         $$1.dx() + (double)($$1.dg() + 1.0F) * 0.5 * (double)axm.b($$1.aX * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double aW() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      esj $$0 = this.dp();
      esh $$1 = cku.a(this, this::b);
      this.a($$1);
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.dt() + $$0.d;
      double $$4 = this.dx() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      if (this.dM().a(this.cH()).noneMatch(dph.a::i)) {
         this.am();
      } else if (this.bf()) {
         this.am();
      } else {
         this.g($$0.a(0.99F));
         this.aY();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      if (this.u() instanceof bqt $$1) {
         $$0.a().a(this.dN().b(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(esf $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   protected void a(aje.a $$0) {
   }

   @Override
   public void a(abb $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dM().a(kn.af, this.dr(), this.dt(), this.dx(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
