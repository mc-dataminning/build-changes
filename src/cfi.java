public class cfi extends cfj {
   public cfi(blj<? extends cfi> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfi(csy $$0, bzk $$1) {
      this(blj.al, $$0);
      this.b($$1);
      this.a_(
         $$1.dr() - (double)($$1.dg() + 1.0F) * 0.5 * (double)aty.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.dv() - 0.1F,
         $$1.dx() + (double)($$1.dg() + 1.0F) * 0.5 * (double)aty.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      elb $$0 = this.dp();
      ekz $$1 = cfk.a(this, this::a);
      this.a($$1);
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.dt() + $$0.d;
      double $$4 = this.dx() + $$0.e;
      this.K();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dM().a(this.cH()).noneMatch(dio.a::i)) {
         this.am();
      } else if (this.bc()) {
         this.am();
      } else {
         this.g($$0.a(0.99F));
         if (!this.aV()) {
            this.g(this.dp().b(0.0, -0.06F, 0.0));
         }

         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eky $$0) {
      super.a($$0);
      if (this.w() instanceof blv $$1) {
         $$0.a().a(this.dN().a(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ekx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   protected void c_() {
   }

   @Override
   public void a(yp $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dM().a(jv.ae, this.dr(), this.dt(), this.dx(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
