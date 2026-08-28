public class cdt implements cdp {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bxw d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cdt.a k = cdt.a.a;

   public cdt(bxw $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cdt.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cdt.a.d) {
         this.k = cdt.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cdt.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cdt.a.c) {
         float $$0 = (float)this.d.h(bza.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = azo.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = azo.a(this.d.dL() * (float) (Math.PI / 180.0));
         float $$6 = azo.b(this.d.dL() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.B($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cdt.a.a;
      } else if (this.k == cdt.a.b) {
         this.k = cdt.a.a;
         double $$9 = this.e - this.d.dA();
         double $$10 = this.g - this.d.dG();
         double $$11 = this.f - this.d.dC();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(azo.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.w(this.b(this.d.dL(), $$13, 90.0F));
         this.d.B((float)(this.h * this.d.h(bza.v)));
         iv $$14 = this.d.dv();
         ebe $$15 = this.d.dV().a_($$14);
         fgk $$16 = $$15.g(this.d.dV(), $$14);
         if ($$11 > (double)this.d.dP() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dq())
            || !$$16.c() && this.d.dC() < $$16.c(jb.a.b) + (double)$$14.v() && !$$15.a(axe.q) && !$$15.a(axe.U)) {
            this.d.N().a();
            this.k = cdt.a.d;
         }
      } else if (this.k == cdt.a.d) {
         this.d.B((float)(this.h * this.d.h(bza.v)));
         if (this.d.aH() || this.d.bl() && this.d.em()) {
            this.k = cdt.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      che $$2 = this.d.O();
      if ($$2 != null) {
         eyb $$3 = $$2.n();
         if ($$3 != null && $$3.a(this.d, iv.a(this.d.dA() + (double)$$0, (double)this.d.dB(), this.d.dG() + (double)$$1)) != eyf.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = azo.h($$1 - $$0);
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
