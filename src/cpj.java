public class cpj extends cpk {
   public cpj(bup<? extends cpj> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpj(dff $$0, cjc $$1) {
      this(bup.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dD() - (double)($$1.dt() + 1.0F) * 0.5 * (double)azn.a($$1.aX * (float) (Math.PI / 180.0)),
         $$1.dH() - 0.1F,
         $$1.dJ() + (double)($$1.dt() + 1.0F) * 0.5 * (double)azn.b($$1.aX * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bf() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      ezr $$0 = this.dB();
      ezp $$1 = cpm.a(this, this::b);
      this.b($$1);
      double $$2 = this.dD() + $$0.d;
      double $$3 = this.dF() + $$0.e;
      double $$4 = this.dJ() + $$0.f;
      this.F();
      float $$5 = 0.99F;
      if (this.dY().a(this.cT()).noneMatch(dvn.a::l)) {
         this.av();
      } else if (this.bo()) {
         this.av();
      } else {
         this.h($$0.c(0.99F));
         this.bh();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ezo $$0) {
      super.a($$0);
      if (this.s() instanceof bve $$1) {
         bui $$2 = $$0.a();
         bsy $$3 = this.dZ().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dY() instanceof arq $$4) {
            dby.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ezn $$0) {
      super.a($$0);
      if (!this.dY().C) {
         this.av();
      }
   }

   @Override
   protected void a(aks.a $$0) {
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dY().a(ls.ah, this.dD(), this.dF(), this.dJ(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
