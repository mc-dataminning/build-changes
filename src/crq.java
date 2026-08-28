public class crq extends bwf implements cru {
   private static final float a = 12.25F;
   private static final akj<czd> b = akn.a(crq.class, akl.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public crq(bwo<? extends crq> $$0, dja $$1) {
      super($$0, $$1);
   }

   public crq(dja $$0, double $$1, double $$2, double $$3) {
      this(bwo.W, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(czd $$0) {
      if ($$0.f()) {
         this.au().a(b, this.g());
      } else {
         this.au().a(b, $$0.c(1));
      }
   }

   @Override
   public czd f() {
      return this.au().a(b);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(b, this.g());
   }

   @Override
   public boolean a(double $$0) {
      if (this.af < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cR().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(iu $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dA();
      double $$5 = $$3 - this.dG();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dA() + $$4 / $$6 * 12.0;
         this.e = this.dG() + $$5 / $$6 * 12.0;
         this.d = this.dC() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.ae.a(5) > 0;
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azm.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.x((float)(azm.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dL();
         this.O = this.dN();
      }
   }

   @Override
   public void h() {
      super.h();
      feq $$0 = this.dy();
      double $$1 = this.dA() + $$0.d;
      double $$2 = this.dC() + $$0.e;
      double $$3 = this.dG() + $$0.f;
      double $$4 = $$0.i();
      this.x(crx.f(this.O, (float)(azm.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.w(crx.f(this.N, (float)(azm.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dV().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azm.d($$6, $$5);
         double $$9 = azm.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dC() < this.d ? 1 : -1;
         $$0 = new feq(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.i($$0);
      }

      float $$12 = 0.25F;
      if (this.bj()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dV().a(lx.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dV()
            .a(lx.af, $$1 - $$0.d * 0.25 + this.ae.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.ae.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dV().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dV().C) {
            this.a(awn.iF, 1.0F, 1.0F);
            this.at();
            if (this.g) {
               this.dV().b(new cnh(this.dV(), this.dA(), this.dC(), this.dG(), this.f()));
            } else {
               this.dV().c(2003, this.dv(), 0);
            }
         }
      } else {
         this.a_($$1, $$2, $$3);
      }
   }

   @Override
   public void b(tz $$0) {
      $$0.a("Item", this.f().a(this.dX()));
   }

   @Override
   public void a(tz $$0) {
      if ($$0.b("Item", 10)) {
         this.a(czd.a(this.dX(), (uw)$$0.p("Item")).orElse(this.g()));
      } else {
         this.a(this.g());
      }
   }

   private czd g() {
      return new czd(czh.tA);
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      return false;
   }
}
