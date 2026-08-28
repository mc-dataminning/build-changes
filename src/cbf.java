public class cbf implements cbb {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bvg d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cbf.a k = cbf.a.a;

   public cbf(bvg $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cbf.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cbf.a.d) {
         this.k = cbf.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cbf.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cbf.a.c) {
         float $$0 = (float)this.d.h(bwm.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = azn.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = azn.a(this.d.dO() * (float) (Math.PI / 180.0));
         float $$6 = azn.b(this.d.dO() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.C($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cbf.a.a;
      } else if (this.k == cbf.a.b) {
         this.k = cbf.a.a;
         double $$9 = this.e - this.d.dD();
         double $$10 = this.g - this.d.dJ();
         double $$11 = this.f - this.d.dF();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(azn.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.v(this.b(this.d.dO(), $$13, 90.0F));
         this.d.C((float)(this.h * this.d.h(bwm.v)));
         jh $$14 = this.d.dy();
         dvo $$15 = this.d.dY().a_($$14);
         fal $$16 = $$15.g(this.d.dY(), $$14);
         if ($$11 > (double)this.d.dS() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dt())
            || !$$16.c() && this.d.dF() < $$16.c(jm.a.b) + (double)$$14.v() && !$$15.a(axd.q) && !$$15.a(axd.T)) {
            this.d.O().a();
            this.k = cbf.a.d;
         }
      } else if (this.k == cbf.a.d) {
         this.d.C((float)(this.h * this.d.h(bwm.v)));
         if (this.d.aL()) {
            this.k = cbf.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      ceq $$2 = this.d.P();
      if ($$2 != null) {
         esb $$3 = $$2.p();
         if ($$3 != null && $$3.a(this.d, jh.a(this.d.dD() + (double)$$0, (double)this.d.dE(), this.d.dJ() + (double)$$1)) != esf.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = azn.h($$1 - $$0);
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
