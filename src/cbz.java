public class cbz implements cbv {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bwa d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cbz.a k = cbz.a.a;

   public cbz(bwa $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cbz.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cbz.a.d) {
         this.k = cbz.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cbz.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cbz.a.c) {
         float $$0 = (float)this.d.h(bxg.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = ayz.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = ayz.a(this.d.dK() * (float) (Math.PI / 180.0));
         float $$6 = ayz.b(this.d.dK() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.C($$1);
         this.d.H(this.i);
         this.d.J(this.j);
         this.k = cbz.a.a;
      } else if (this.k == cbz.a.b) {
         this.k = cbz.a.a;
         double $$9 = this.e - this.d.dz();
         double $$10 = this.g - this.d.dF();
         double $$11 = this.f - this.d.dB();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.H(0.0F);
            return;
         }

         float $$13 = (float)(ayz.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.w(this.b(this.d.dK(), $$13, 90.0F));
         this.d.C((float)(this.h * this.d.h(bxg.v)));
         ji $$14 = this.d.du();
         dxq $$15 = this.d.dU().a_($$14);
         fcr $$16 = $$15.g(this.d.dU(), $$14);
         if ($$11 > (double)this.d.dO() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dp())
            || !$$16.c() && this.d.dB() < $$16.c(jn.a.b) + (double)$$14.v() && !$$15.a(awp.q) && !$$15.a(awp.U)) {
            this.d.N().a();
            this.k = cbz.a.d;
         }
      } else if (this.k == cbz.a.d) {
         this.d.C((float)(this.h * this.d.h(bxg.v)));
         if (this.d.aJ() || this.d.bl() && this.d.ek()) {
            this.k = cbz.a.a;
         }
      } else {
         this.d.H(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cfk $$2 = this.d.O();
      if ($$2 != null) {
         euj $$3 = $$2.n();
         if ($$3 != null && $$3.a(this.d, ji.a(this.d.dz() + (double)$$0, (double)this.d.dA(), this.d.dF() + (double)$$1)) != eun.c) {
            return false;
         }
      }

      return true;
   }

   protected float b(float $$0, float $$1, float $$2) {
      float $$3 = ayz.h($$1 - $$0);
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
