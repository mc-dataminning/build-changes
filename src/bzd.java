public class bzd implements byz {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bte d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bzd.a k = bzd.a.a;

   public bzd(bte $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bzd.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bzd.a.d) {
         this.k = bzd.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bzd.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bzd.a.c) {
         float $$0 = (float)this.d.g(buk.v);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = ayg.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = ayg.a(this.d.dH() * (float) (Math.PI / 180.0));
         float $$6 = ayg.b(this.d.dH() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.z($$1);
         this.d.D(this.i);
         this.d.F(this.j);
         this.k = bzd.a.a;
      } else if (this.k == bzd.a.b) {
         this.k = bzd.a.a;
         double $$9 = this.e - this.d.dw();
         double $$10 = this.g - this.d.dC();
         double $$11 = this.f - this.d.dy();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.D(0.0F);
            return;
         }

         float $$13 = (float)(ayg.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.s(this.a(this.d.dH(), $$13, 90.0F));
         this.d.z((float)(this.h * this.d.g(buk.v)));
         ja $$14 = this.d.dr();
         dsl $$15 = this.d.dR().a_($$14);
         exa $$16 = $$15.k(this.d.dR(), $$14);
         if ($$11 > (double)this.d.dL() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dl())
            || !$$16.c() && this.d.dy() < $$16.c(jf.a.b) + (double)$$14.v() && !$$15.a(avw.p) && !$$15.a(avw.S)) {
            this.d.I().a();
            this.k = bzd.a.d;
         }
      } else if (this.k == bzd.a.d) {
         this.d.z((float)(this.h * this.d.g(buk.v)));
         if (this.d.aG()) {
            this.k = bzd.a.a;
         }
      } else {
         this.d.D(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cco $$2 = this.d.J();
      if ($$2 != null) {
         eow $$3 = $$2.o();
         if ($$3 != null && $$3.a(this.d, ja.a(this.d.dw() + (double)$$0, (double)this.d.dx(), this.d.dC() + (double)$$1)) != epa.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = ayg.g($$1 - $$0);
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
