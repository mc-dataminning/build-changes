public class cpa extends cpb {
   public cpa(bug<? extends cpa> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpa(dev $$0, cit $$1) {
      this(bug.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dC() - (double)($$1.ds() + 1.0F) * 0.5 * (double)azj.a($$1.aU * (float) (Math.PI / 180.0)),
         $$1.dG() - 0.1F,
         $$1.dI() + (double)($$1.ds() + 1.0F) * 0.5 * (double)azj.b($$1.aU * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double be() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      ezh $$0 = this.dA();
      ezf $$1 = cpd.a(this, this::b);
      this.b($$1);
      double $$2 = this.dC() + $$0.d;
      double $$3 = this.dE() + $$0.e;
      double $$4 = this.dI() + $$0.f;
      this.G();
      float $$5 = 0.99F;
      if (this.dX().a(this.cS()).noneMatch(dvc.a::l)) {
         this.au();
      } else if (this.bn()) {
         this.au();
      } else {
         this.h($$0.c(0.99F));
         this.bg();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eze $$0) {
      super.a($$0);
      if (this.s() instanceof buv $$1) {
         btz $$2 = $$0.a();
         bsp $$3 = this.dY().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dX() instanceof arm $$4) {
            dbo.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ezd $$0) {
      super.a($$0);
      if (!this.dX().C) {
         this.au();
      }
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dX().a(lq.ah, this.dC(), this.dE(), this.dI(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
