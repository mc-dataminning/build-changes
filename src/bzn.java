public class bzn implements bzj {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final btn d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bzn.a k = bzn.a.a;

   public bzn(btn $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bzn.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bzn.a.d) {
         this.k = bzn.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bzn.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bzn.a.c) {
         float $$0 = (float)this.d.g(buu.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = ayn.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = ayn.a(this.d.dG() * (float) (Math.PI / 180.0));
         float $$6 = ayn.b(this.d.dG() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.z($$1);
         this.d.D(this.i);
         this.d.F(this.j);
         this.k = bzn.a.a;
      } else if (this.k == bzn.a.b) {
         this.k = bzn.a.a;
         double $$9 = this.e - this.d.dv();
         double $$10 = this.g - this.d.dB();
         double $$11 = this.f - this.d.dx();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.D(0.0F);
            return;
         }

         float $$13 = (float)(ayn.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.s(this.a(this.d.dG(), $$13, 90.0F));
         this.d.z((float)(this.h * this.d.g(buu.v)));
         jd $$14 = this.d.dq();
         dta $$15 = this.d.dQ().a_($$14);
         exp $$16 = $$15.k(this.d.dQ(), $$14);
         if ($$11 > (double)this.d.dK() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dk())
            || !$$16.c() && this.d.dx() < $$16.c(ji.a.b) + (double)$$14.v() && !$$15.a(awd.p) && !$$15.a(awd.S)) {
            this.d.I().a();
            this.k = bzn.a.d;
         }
      } else if (this.k == bzn.a.d) {
         this.d.z((float)(this.h * this.d.g(buu.v)));
         if (this.d.aF()) {
            this.k = bzn.a.a;
         }
      } else {
         this.d.D(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      ccy $$2 = this.d.J();
      if ($$2 != null) {
         epl $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d, jd.a(this.d.dv() + (double)$$0, (double)this.d.dw(), this.d.dB() + (double)$$1)) != epp.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ayn.g($$1 - $$0);
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
