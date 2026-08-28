public class cnc extends cnd {
   public cnc(bsn<? extends cnc> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnc(dcg $$0, cgz $$1) {
      this(bsn.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dw() - (double)($$1.dl() + 1.0F) * 0.5 * (double)ayg.a($$1.aZ * (float) (Math.PI / 180.0)),
         $$1.dA() - 0.1F,
         $$1.dC() + (double)($$1.dl() + 1.0F) * 0.5 * (double)ayg.b($$1.aZ * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double ba() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      ewh $$0 = this.du();
      ewf $$1 = cnf.a(this, this::b);
      this.b($$1);
      double $$2 = this.dw() + $$0.c;
      double $$3 = this.dy() + $$0.d;
      double $$4 = this.dC() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      if (this.dR().a(this.cM()).noneMatch(dsk.a::i)) {
         this.aq();
      } else if (this.bj()) {
         this.aq();
      } else {
         this.j($$0.a(0.99F));
         this.bc();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      if (this.s() instanceof btc $$1) {
         bsh $$2 = $$0.a();
         bra $$3 = this.dS().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dR() instanceof aqm $$4) {
            czo.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);
      if (!this.dR().B) {
         this.aq();
      }
   }

   @Override
   protected void a(ajt.a $$0) {
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dR().a(lj.ah, this.dw(), this.dy(), this.dC(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
