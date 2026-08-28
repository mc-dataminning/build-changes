public class cpp extends cpq {
   public cpp(bur<? extends cpp> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpp(dgi $$0, cje $$1) {
      this(bur.az, $$0);
      this.c($$1);
      this.a_(
         $$1.dB() - (double)($$1.dr() + 1.0F) * 0.5 * (double)ayz.a($$1.aX * (float) (Math.PI / 180.0)),
         $$1.dF() - 0.1F,
         $$1.dH() + (double)($$1.dr() + 1.0F) * 0.5 * (double)ayz.b($$1.aX * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bd() {
      return 0.06;
   }

   @Override
   public void h() {
      super.h();
      fba $$0 = this.dz();
      fay $$1 = cps.a(this, this::b);
      this.b($$1);
      double $$2 = this.dB() + $$0.d;
      double $$3 = this.dD() + $$0.e;
      double $$4 = this.dH() + $$0.f;
      this.F();
      float $$5 = 0.99F;
      if (this.dW().a(this.cR()).noneMatch(dww.a::l)) {
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
   protected void a(fax $$0) {
      super.a($$0);
      if (this.p() instanceof bvg $$1) {
         buk $$2 = $$0.a();
         bta $$3 = this.dX().b(this, $$1);
         if (this.dW() instanceof arc $$4 && $$2.a($$4, $$3, 1.0F)) {
            ddb.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.at();
      }
   }

   @Override
   protected void a(akb.a $$0) {
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dW().a(lt.aj, this.dB(), this.dD(), this.dH(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
