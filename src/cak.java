public class cak implements cag {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bum d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cak.a k = cak.a.a;

   public cak(bum $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cak.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cak.a.d) {
         this.k = cak.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cak.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cak.a.c) {
         float $$0 = (float)this.d.h(bvr.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = azd.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = azd.a(this.d.dI() * (float) (Math.PI / 180.0));
         float $$6 = azd.b(this.d.dI() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.C($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cak.a.a;
      } else if (this.k == cak.a.b) {
         this.k = cak.a.a;
         double $$9 = this.e - this.d.dx();
         double $$10 = this.g - this.d.dD();
         double $$11 = this.f - this.d.dz();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(azd.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.v(this.a(this.d.dI(), $$13, 90.0F));
         this.d.C((float)(this.h * this.d.h(bvr.v)));
         je $$14 = this.d.ds();
         duo $$15 = this.d.dS().a_($$14);
         ezm $$16 = $$15.g(this.d.dS(), $$14);
         if ($$11 > (double)this.d.dM() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dn())
            || !$$16.c() && this.d.dz() < $$16.c(jj.a.b) + (double)$$14.v() && !$$15.a(awt.q) && !$$15.a(awt.T)) {
            this.d.O().a();
            this.k = cak.a.d;
         }
      } else if (this.k == cak.a.d) {
         this.d.C((float)(this.h * this.d.h(bvr.v)));
         if (this.d.aH()) {
            this.k = cak.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cdv $$2 = this.d.P();
      if ($$2 != null) {
         erc $$3 = $$2.p();
         if ($$3 != null && $$3.a(this.d, je.a(this.d.dx() + (double)$$0, (double)this.d.dy(), this.d.dD() + (double)$$1)) != erg.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = azd.g($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      float $$4 = $$0 + $$3;
      if ($$4 < 0.0F) {
         $$4 += 360.0F;
      } else if ($$4 > 360.0F) {
         $$4 -= 360.0F;
      }

      return $$4;
   }

   public double d() {
      return this.e;
   }

   public double e() {
      return this.f;
   }

   public double f() {
      return this.g;
   }

   protected static enum a {
      a,
      b,
      c,
      d;
   }
}
