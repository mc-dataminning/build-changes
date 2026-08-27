public class ccl extends ccm {
   public ccl(biu<? extends ccl> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public ccl(cpv $$0, bwt $$1) {
      this(biu.ak, $$0);
      this.b($$1);
      this.e(
         $$1.dq() - (double)($$1.dg() + 1.0F) * 0.5 * (double)arx.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.du() - 0.1F,
         $$1.dw() + (double)($$1.dg() + 1.0F) * 0.5 * (double)arx.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      ehn $$0 = this.do();
      ehl $$1 = ccn.a(this, this::a);
      this.a($$1);
      double $$2 = this.dq() + $$0.c;
      double $$3 = this.ds() + $$0.d;
      double $$4 = this.dw() + $$0.e;
      this.H();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dL().a(this.cH()).noneMatch(dfi.a::i)) {
         this.al();
      } else if (this.bb()) {
         this.al();
      } else {
         this.f($$0.a(0.99F));
         if (!this.aU()) {
            this.f(this.do().b(0.0, -0.06F, 0.0));
         }

         this.e($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ehk $$0) {
      super.a($$0);
      if (this.v() instanceof bjg $$1) {
         $$0.a().a(this.dM().a(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ehj $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.al();
      }
   }

   @Override
   protected void a_() {
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dL().a(ix.ab, this.dq(), this.ds(), this.dw(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
