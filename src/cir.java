public class cir extends cis {
   public cir(bol<? extends cir> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cir(cwe $$0, ccr $$1) {
      this(bol.am, $$0);
      this.b($$1);
      this.a_(
         $$1.do() - (double)($$1.dd() + 1.0F) * 0.5 * (double)awm.a($$1.aV * (float) (Math.PI / 180.0)),
         $$1.ds() - 0.1F,
         $$1.du() + (double)($$1.dd() + 1.0F) * 0.5 * (double)awm.b($$1.aV * (float) (Math.PI / 180.0))
      );
   }

   @Override
   public void l() {
      super.l();
      eov $$0 = this.dm();
      eot $$1 = ciu.a(this, this::a);
      this.a($$1);
      double $$2 = this.do() + $$0.c;
      double $$3 = this.dq() + $$0.d;
      double $$4 = this.du() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      float $$6 = 0.06F;
      if (this.dJ().a(this.cE()).noneMatch(dmd.a::i)) {
         this.am();
      } else if (this.bc()) {
         this.am();
      } else {
         this.g($$0.a(0.99F));
         if (!this.aV()) {
            this.g(this.dm().b(0.0, -0.06F, 0.0));
         }

         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      if (this.w() instanceof box $$1) {
         $$0.a().a(this.dK().b(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(eor $$0) {
      super.a($$0);
      if (!this.dJ().B) {
         this.am();
      }
   }

   @Override
   protected void c_() {
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dJ().a(kb.ae, this.do(), this.dq(), this.du(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
