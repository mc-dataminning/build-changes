public class cdb implements ccx {
   public static final float a = 5.0E-4F;
   public static final float b = 2.5000003E-7F;
   protected static final int c = 90;
   protected final bxe d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected float i;
   protected float j;
   protected cdb.a k = cdb.a.a;

   public cdb(bxe $$0) {
      this.d = $$0;
   }

   public boolean b() {
      return this.k == cdb.a.b;
   }

   public double c() {
      return this.h;
   }

   public void a(double $$0, double $$1, double $$2, double $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      if (this.k != cdb.a.d) {
         this.k = cdb.a.b;
      }
   }

   public void a(float $$0, float $$1) {
      this.k = cdb.a.c;
      this.i = $$0;
      this.j = $$1;
      this.h = 0.25;
   }

   public void a() {
      if (this.k == cdb.a.c) {
         float $$0 = (float)this.d.h(byi.v);
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
         float $$5 = azm.a(this.d.dL() * (float) (Math.PI / 180.0));
         float $$6 = azm.b(this.d.dL() * (float) (Math.PI / 180.0));
         float $$7 = $$2 * $$6 - $$3 * $$5;
         float $$8 = $$3 * $$6 + $$2 * $$5;
         if (!this.b($$7, $$8)) {
            this.i = 1.0F;
            this.j = 0.0F;
         }

         this.d.B($$1);
         this.d.G(this.i);
         this.d.I(this.j);
         this.k = cdb.a.a;
      } else if (this.k == cdb.a.b) {
         this.k = cdb.a.a;
         double $$9 = this.e - this.d.dA();
         double $$10 = this.g - this.d.dG();
         double $$11 = this.f - this.d.dC();
         double $$12 = $$9 * $$9 + $$11 * $$11 + $$10 * $$10;
         if ($$12 < 2.5000003E-7F) {
            this.d.G(0.0F);
            return;
         }

         float $$13 = (float)(azm.d($$10, $$9) * 180.0F / (float)Math.PI) - 90.0F;
         this.d.w(this.b(this.d.dL(), $$13, 90.0F));
         this.d.B((float)(this.h * this.d.h(byi.v)));
         iu $$14 = this.d.dv();
         dzz $$15 = this.d.dV().a_($$14);
         ffc $$16 = $$15.g(this.d.dV(), $$14);
         if ($$11 > (double)this.d.dP() && $$9 * $$9 + $$10 * $$10 < (double)Math.max(1.0F, this.d.dq())
            || !$$16.c() && this.d.dC() < $$16.c(ja.a.b) + (double)$$14.v() && !$$15.a(axc.q) && !$$15.a(axc.U)) {
            this.d.N().a();
            this.k = cdb.a.d;
         }
      } else if (this.k == cdb.a.d) {
         this.d.B((float)(this.h * this.d.h(byi.v)));
         if (this.d.aJ() || this.d.bm() && this.d.el()) {
            this.k = cdb.a.a;
         }
      } else {
         this.d.G(0.0F);
      }
   }

   private boolean b(float $$0, float $$1) {
      cgm $$2 = this.d.O();
      if ($$2 != null) {
         ewt $$3 = $$2.n();
         if ($$3 != null && $$3.a(this.d, iu.a(this.d.dA() + (double)$$0, (double)this.d.dB(), this.d.dG() + (double)$$1)) != ewx.c) {
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
