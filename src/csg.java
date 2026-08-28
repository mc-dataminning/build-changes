public class csg extends csh {
   public csg(bwr<? extends csg> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csg(djm $$0, cll $$1) {
      this(bwr.ay, $$0);
      this.c($$1);
      this.a_(
         $$1.dz() - (double)($$1.dp() + 1.0F) * 0.5 * (double)azm.a($$1.aV * (float) (Math.PI / 180.0)),
         $$1.dD() - 0.1F,
         $$1.dF() + (double)($$1.dp() + 1.0F) * 0.5 * (double)azm.b($$1.aV * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bb() {
      return 0.06;
   }

   @Override
   public void h() {
      super.h();
      ffc $$0 = this.dx();
      ffa $$1 = csj.a(this, this::b);
      this.b($$1);
      double $$2 = this.dz() + $$0.d;
      double $$3 = this.dB() + $$0.e;
      double $$4 = this.dF() + $$0.f;
      this.A();
      float $$5 = 0.99F;
      if (this.dU().a(this.cQ()).noneMatch(eas.a::l)) {
         this.aq();
      } else if (this.bh()) {
         this.aq();
      } else {
         this.i($$0.c(0.99F));
         this.bd();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(fez $$0) {
      super.a($$0);
      if (this.q() instanceof bxj $$1) {
         bwi $$2 = $$0.a();
         bux $$3 = this.dV().b(this, $$1);
         if (this.dU() instanceof arq $$4 && $$2.a($$4, $$3, 1.0F)) {
            dgc.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(fey $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.aq();
      }
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dU().a(ly.ak, this.dz(), this.dB(), this.dF(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
