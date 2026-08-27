public class bly implements blu {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bgb d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected bly.a k = bly.a.a;

   public bly(bgb $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == bly.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != bly.a.d) {
         this.k = bly.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = bly.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == bly.a.c) {
         float $$0 = (float)this.d.b(bhg.d);
         float $$1 = (float)this.h * $$0;
         float $$2 = this.i;
         float $$3 = this.j;
         float $$4 = apa.c($$2 * $$2 + $$3 * $$3);
         if ($$4 < 1.0F) {
            $$4 = 1.0F;
         }

         $$4 = $$1 / $$4;
         $$2 *= $$4;
         $$3 *= $$4;
         float $$5 = apa.a(this.d.dy() * (float) (Math.PI / 180.0));
         float $$6 = apa.b(this.d.dy() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.w($$1);
         this.d.z(this.i);
         this.d.B(this.j);
         this.k = bly.a.a;
      } else if (this.k == bly.a.b) {
         this.k = bly.a.a;
         double $$9 = this.e - this.d.dn();
         double $$10 = this.g - this.d.dt();
         double $$11 = this.f - this.d.dp();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.z(0.0F);
            return;
         }

         float $$13 = (float)(apa.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.a_(this.a(this.d.dy(), $$13, 90.0F));
         this.d.w((float)(this.h * this.d.b(bhg.d)));
         gu $$14 = this.d.di();
         dcb $$15 = this.d.dI().a_($$14);
         efb $$16 = $$15.k(this.d.dI(), $$14);
         if ($$11 > (double)this.d.dC() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dd())
            || !$$16.b() && this.d.dp() < $$16.c(ha.a.b) + (double)$$14.v() && !$$15.a(amw.p) && !$$15.a(amw.S)) {
            this.d.I().a();
            this.k = bly.a.d;
         }
      } else if (this.k == bly.a.d) {
         this.d.w((float)(this.h * this.d.b(bhg.d)));
         if (this.d.ay()) {
            this.k = bly.a.a;
         }
      } else {
         this.d.z(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      bpj $$2 = this.d.J();
      if ($$2 != null) {
         dxs $$3 = $$2.p();
         if ($$3 != null && $$3.a(this.d.dI(), apa.a(this.d.dn() + (double)$$0), this.d.do(), apa.a(this.d.dt() + (double)$$1)) != dxp.c) {
            return false;
         }
      }

      return true;
   }

   protected float a(float $$0, float $$1, float $$2) {
      float $$3 = apa.g($$1 - $$0);
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
