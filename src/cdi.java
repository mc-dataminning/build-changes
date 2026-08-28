public class cdi implements cde {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bxl d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cdi.a k = cdi.a.a;

   public cdi(bxl $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cdi.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cdi.a.d) {
         this.k = cdi.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cdi.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cdi.a.c) {
         float $$0 = (float)this.d.h(byp.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = azm.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = azm.a(this.d.dK() * (float) (Math.PI / 180.0));
         float $$6 = azm.b(this.d.dK() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.B($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cdi.a.a;
      } else if (this.k == cdi.a.b) {
         this.k = cdi.a.a;
         double $$9 = this.e - this.d.dz();
         double $$10 = this.g - this.d.dF();
         double $$11 = this.f - this.d.dB();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(azm.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.w(this.b(this.d.dK(), $$13, 90.0F));
         this.d.B((float)(this.h * this.d.h(byp.v)));
         iv $$14 = this.d.du();
         eao $$15 = this.d.dU().a_($$14);
         ffr $$16 = $$15.g(this.d.dU(), $$14);
         if ($$11 > (double)this.d.dO() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dp())
            || !$$16.c() && this.d.dB() < $$16.c(jb.a.b) + (double)$$14.v() && !$$15.a(axc.q) && !$$15.a(axc.U)) {
            this.d.N().a();
            this.k = cdi.a.d;
         }
      } else if (this.k == cdi.a.d) {
         this.d.B((float)(this.h * this.d.h(byp.v)));
         if (this.d.aH() || this.d.bk() && this.d.el()) {
            this.k = cdi.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cgt $$2 = this.d.O();
      if ($$2 != null) {
         exi $$3 = $$2.n();
         if ($$3 != null && $$3.a(this.d, iv.a(this.d.dz() + (double)$$0, (double)this.d.dA(), this.d.dF() + (double)$$1)) != exm.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = azm.h($$1 - $$0);
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
