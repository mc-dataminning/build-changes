public class ccc extends ccd {
   public ccc(bik<? extends ccc> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public ccc(cpk $$0, bwk $$1) {
      this(bik.ak, $$0);
      this.b($$1);
      this.e(
         $$1.dp() - (double)($$1.df() + 1.0F) * 0.5 * (double)aro.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.dt() - 0.1F,
         $$1.dv() + (double)($$1.df() + 1.0F) * 0.5 * (double)aro.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      ehf $$0 = this.dn();
      ehd $$1 = cce.a(this, this::a);
      this.a($$1);
      double $$2 = this.dp() + $$0.c;
      double $$3 = this.dr() + $$0.d;
      double $$4 = this.dv() + $$0.e;
      this.B();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dK().a(this.cG()).noneMatch(dex.a::i)) {
         this.ak();
      } else if (this.ba()) {
         this.ak();
      } else {
         this.f($$0.a(0.99F));
         if (!this.aT()) {
            this.f(this.dn().b(0.0, -0.06F, 0.0));
         }

         this.e($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (this.v() instanceof biw $$1) {
         $$0.a().a(this.dL().a(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.ak();
      }
   }

   @Override
   protected void a_() {
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dK().a(iw.ab, this.dp(), this.dr(), this.dv(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
