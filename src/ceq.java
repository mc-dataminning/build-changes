public class ceq extends cer {
   public ceq(bkz<? extends ceq> $$0, csf $$1) {
      super($$0, $$1);
   }

   public ceq(csf $$0, byy $$1) {
      this(bkz.ak, $$0);
      this.b($$1);
      this.a_(
         $$1.ds() - (double)($$1.dh() + 1.0F) * 0.5 * (double)atq.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.dw() - 0.1F,
         $$1.dy() + (double)($$1.dh() + 1.0F) * 0.5 * (double)atq.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      ejz $$0 = this.dq();
      ejx $$1 = ces.a(this, this::a);
      this.a($$1);
      double $$2 = this.ds() + $$0.c;
      double $$3 = this.du() + $$0.d;
      double $$4 = this.dy() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dN().a(this.cH()).noneMatch(dhm.a::i)) {
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
   protected void a(ejw $$0) {
      super.a($$0);
      if (this.w() instanceof bll $$1) {
         $$0.a().a(this.dO().a(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(ejv $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.am();
      }
   }

   @Override
   protected void c_() {
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dN().a(jw.ac, this.ds(), this.du(), this.dy(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
