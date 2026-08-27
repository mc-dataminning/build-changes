public class cgh extends cgi {
   public cgh(bmc<? extends cgh> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgh(ctx $$0, cah $$1) {
      this(bmc.am, $$0);
      this.c($$1);
      this.a_(
         $$1.dq() - (double)($$1.dg() + 1.0F) * 0.5 * (double)aup.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.du() - 0.1F,
         $$1.dw() + (double)($$1.dg() + 1.0F) * 0.5 * (double)aup.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      emc $$0 = this.do();
      ema $$1 = cgj.a(this, this::b);
      this.a($$1);
      double $$2 = this.dq() + $$0.c;
      double $$3 = this.ds() + $$0.d;
      double $$4 = this.dw() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dL().a(this.cH()).noneMatch(djo.a::i)) {
         this.am();
      } else if (this.bc()) {
         this.am();
      } else {
         this.g($$0.a(0.99F));
         if (!this.aV()) {
            this.g(this.do().b(0.0, -0.06F, 0.0));
         }

         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      if (this.w() instanceof bmo $$1) {
         $$0.a().a(this.dM().b(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ely $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.am();
      }
   }

   @Override
   protected void c_() {
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dL().a(jx.ae, this.dq(), this.ds(), this.dw(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
