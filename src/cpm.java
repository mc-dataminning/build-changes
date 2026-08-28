public class cpm extends cpn {
   public cpm(bus<? extends cpm> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpm(dfm $$0, cjf $$1) {
      this(bus.ax, $$0);
      this.c($$1);
      this.a_(
         $$1.dA() - (double)($$1.dq() + 1.0F) * 0.5 * (double)azm.a($$1.aW * (float) (Math.PI / 180.0)),
         $$1.dE() - 0.1F,
         $$1.dG() + (double)($$1.dq() + 1.0F) * 0.5 * (double)azm.b($$1.aW * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bd() {
      return 0.06;
   }

   @Override
   public void h() {
      super.h();
      ezy $$0 = this.dy();
      ezw $$1 = cpp.a(this, this::b);
      this.b($$1);
      double $$2 = this.dA() + $$0.d;
      double $$3 = this.dC() + $$0.e;
      double $$4 = this.dG() + $$0.f;
      this.C();
      float $$5 = 0.99F;
      if (this.dV().a(this.cR()).noneMatch(dvu.a::l)) {
         this.at();
      } else if (this.bm()) {
         this.at();
      } else {
         this.h($$0.c(0.99F));
         this.bf();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      if (this.p() instanceof bvh $$1) {
         bul $$2 = $$0.a();
         btb $$3 = this.dW().b(this, $$1);
         if (this.dV() instanceof arp $$4 && $$2.a($$4, $$3, 1.0F)) {
            dcf.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ezu $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.at();
      }
   }

   @Override
   protected void a(akq.a $$0) {
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dV().a(ls.ah, this.dA(), this.dC(), this.dG(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
