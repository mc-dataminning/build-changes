public class coz extends bue implements cpd {
   private static final float b = 12.25F;
   private static final akl<cwb> c = akp.a(coz.class, akn.h);
   private double d;
   private double e;
   private double f;
   private int g;
   private boolean h;

   public coz(bul<? extends coz> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public coz(dfb $$0, double $$1, double $$2, double $$3) {
      this(bul.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cwb $$0) {
      if ($$0.f()) {
         this.aw().a(c, this.o());
      } else {
         this.aw().a(c, $$0.c(1));
      }
   }

   @Override
   public cwb m() {
      return this.aw().a(c);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(c, this.o());
   }

   @Override
   public boolean a(double $$0) {
      if (this.ag < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cS().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(jh $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dC();
      double $$5 = $$3 - this.dI();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.d = this.dC() + $$4 / $$6 * 12.0;
         this.f = this.dI() + $$5 / $$6 * 12.0;
         this.e = this.dE() + 8.0;
      } else {
         this.d = $$1;
         this.e = (double)$$2;
         this.f = $$3;
      }

      this.g = 0;
      this.h = this.af.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.v((float)(azk.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(azk.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dN();
         this.P = this.dP();
      }
   }

   @Override
   public void l() {
      super.l();
      ezn $$0 = this.dA();
      double $$1 = this.dC() + $$0.d;
      double $$2 = this.dE() + $$0.e;
      double $$3 = this.dI() + $$0.f;
      double $$4 = $$0.i();
      this.w(cpg.e(this.P, (float)(azk.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(cpg.e(this.O, (float)(azk.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dX().C) {
         double $$5 = this.d - $$1;
         double $$6 = this.f - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azk.d($$6, $$5);
         double $$9 = azk.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dE() < this.e ? 1 : -1;
         $$0 = new ezn(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.bk()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dX().a(lr.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dX()
            .a(lr.ac, $$1 - $$0.d * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.af.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dX().C) {
         this.a_($$1, $$2, $$3);
         this.g++;
         if (this.g > 80 && !this.dX().C) {
            this.a(awl.ii, 1.0F, 1.0F);
            this.av();
            if (this.h) {
               this.dX().b(new ckv(this.dX(), this.dC(), this.dE(), this.dI(), this.m()));
            } else {
               this.dX().c(2003, this.dx(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(uk $$0) {
      $$0.a("Item", this.m().a(this.dZ()));
   }

   @Override
   public void a(uk $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cwb.a(this.dZ(), (vh)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cwb o() {
      return new cwb(cwf.st);
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   public boolean cC() {
      return false;
   }
}
