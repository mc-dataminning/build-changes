public class cel extends cem {
   public cel(bku<? extends cel> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cel(csa $$0, byt $$1) {
      this(bku.ak, $$0);
      this.b($$1);
      this.a_(
         $$1.ds() - (double)($$1.dh() + 1.0F) * 0.5 * (double)atm.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.dw() - 0.1F,
         $$1.dy() + (double)($$1.dh() + 1.0F) * 0.5 * (double)atm.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      eju $$0 = this.dq();
      ejs $$1 = cen.a(this, this::a);
      this.a($$1);
      double $$2 = this.ds() + $$0.c;
      double $$3 = this.du() + $$0.d;
      double $$4 = this.dy() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dN().a(this.cH()).noneMatch(dhh.a::i)) {
         this.am();
      } else if (this.bc()) {
         this.am();
      } else {
         this.g($$0.a(0.99F));
         if (!this.aV()) {
            this.g(this.dq().b(0.0, -0.06F, 0.0));
         }

         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      if (this.w() instanceof blg $$1) {
         $$0.a().a(this.dO().a(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ejq $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.am();
      }
   }

   @Override
   protected void b_() {
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dN().a(js.ac, this.ds(), this.du(), this.dy(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
