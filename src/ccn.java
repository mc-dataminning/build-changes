public class ccn extends cco {
   public ccn(biw<? extends ccn> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccn(cpx $$0, bwv $$1) {
      this(biw.ak, $$0);
      this.b($$1);
      this.e(
         $$1.dq() - (double)($$1.df() + 1.0F) * 0.5 * (double)ary.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.du() - 0.1F,
         $$1.dw() + (double)($$1.df() + 1.0F) * 0.5 * (double)ary.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      ehp $$0 = this.do();
      ehn $$1 = ccp.a(this, this::a);
      this.a($$1);
      double $$2 = this.dq() + $$0.c;
      double $$3 = this.ds() + $$0.d;
      double $$4 = this.dw() + $$0.e;
      this.H();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dL().a(this.cG()).noneMatch(dfk.a::i)) {
         this.ak();
      } else if (this.ba()) {
         this.ak();
      } else {
         this.f($$0.a(0.99F));
         if (!this.aT()) {
            this.f(this.do().b(0.0, -0.06F, 0.0));
         }

         this.e($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ehm $$0) {
      super.a($$0);
      if (this.v() instanceof bji $$1) {
         $$0.a().a(this.dM().a(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.ak();
      }
   }

   @Override
   protected void a_() {
   }

   @Override
   public void a(wz $$0) {
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
