public class cic extends cid {
   public cic(bnw<? extends cic> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cic(cvr $$0, ccc $$1) {
      this(bnw.am, $$0);
      this.b($$1);
      this.a_(
         $$1.dr() - (double)($$1.dg() + 1.0F) * 0.5 * (double)awi.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.dv() - 0.1F,
         $$1.dx() + (double)($$1.dg() + 1.0F) * 0.5 * (double)awi.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      enz $$0 = this.dp();
      enx $$1 = cif.a(this, this::a);
      this.a($$1);
      double $$2 = this.dr() + $$0.c;
      double $$3 = this.dt() + $$0.d;
      double $$4 = this.dx() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dM().a(this.cH()).noneMatch(dli.a::i)) {
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
   protected void a(enw $$0) {
      super.a($$0);
      if (this.w() instanceof boi $$1) {
         $$0.a().a(this.dN().b(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(env $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   protected void c_() {
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dM().a(jz.ae, this.dr(), this.dt(), this.dx(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
