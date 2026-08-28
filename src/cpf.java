public class cpf extends cpg {
   public cpf(bul<? extends cpf> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpf(dfb $$0, ciy $$1) {
      this(bul.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dC() - (double)($$1.ds() + 1.0F) * 0.5 * (double)azk.a($$1.aX * (float) (Math.PI / 180.0)),
         $$1.dG() - 0.1F,
         $$1.dI() + (double)($$1.ds() + 1.0F) * 0.5 * (double)azk.b($$1.aX * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double be() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      ezn $$0 = this.dA();
      ezl $$1 = cpi.a(this, this::b);
      this.b($$1);
      double $$2 = this.dC() + $$0.d;
      double $$3 = this.dE() + $$0.e;
      double $$4 = this.dI() + $$0.f;
      this.F();
      float $$5 = 0.99F;
      if (this.dX().a(this.cS()).noneMatch(dvi.a::l)) {
         this.av();
      } else if (this.bn()) {
         this.av();
      } else {
         this.h($$0.c(0.99F));
         this.bg();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      if (this.s() instanceof bva $$1) {
         bue $$2 = $$0.a();
         bsu $$3 = this.dY().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dX() instanceof arn $$4) {
            dbu.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ezj $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.av();
      }
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dX().a(lr.ah, this.dC(), this.dE(), this.dI(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
