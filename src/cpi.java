public class cpi extends buk implements cpm {
   private static final float a = 12.25F;
   private static final ajy<cwo> b = akc.a(cpi.class, aka.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cpi(bur<? extends cpi> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpi(dgh $$0, double $$1, double $$2, double $$3) {
      this(bur.W, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cwo $$0) {
      if ($$0.f()) {
         this.au().a(b, this.m());
      } else {
         this.au().a(b, $$0.c(1));
      }
   }

   @Override
   public cwo l() {
      return this.au().a(b);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(b, this.m());
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

   public void a(ji $$0) {
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
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.v((float)(ayz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(ayz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dL();
         this.O = this.dN();
      }
   }

   @Override
   public void h() {
      super.h();
      faz $$0 = this.dy();
      double $$1 = this.dA() + $$0.d;
      double $$2 = this.dC() + $$0.e;
      double $$3 = this.dG() + $$0.f;
      double $$4 = $$0.i();
      this.w(cpp.f(this.O, (float)(ayz.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(cpp.f(this.N, (float)(ayz.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dV().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ayz.d($$6, $$5);
         double $$9 = ayz.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dC() < this.d ? 1 : -1;
         $$0 = new faz(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.i($$0);
      }

      float $$12 = 0.25F;
      if (this.bj()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dV().a(lt.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dV()
            .a(lt.ae, $$1 - $$0.d * 0.25 + this.ae.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.ae.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dV().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dV().C) {
            this.a(awa.iC, 1.0F, 1.0F);
            this.at();
            if (this.g) {
               this.dV().b(new clb(this.dV(), this.dA(), this.dC(), this.dG(), this.l()));
            } else {
               this.dV().c(2003, this.dv(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(tq $$0) {
      $$0.a("Item", this.l().a(this.dX()));
   }

   @Override
   public void a(tq $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cwo.a(this.dX(), (un)$$0.p("Item")).orElse(this.m()));
      } else {
         this.a(this.m());
      }
   }

   private cwo m() {
      return new cwo(cws.tp);
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      return false;
   }
}
