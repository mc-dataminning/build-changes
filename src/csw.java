public class csw extends bxe implements cta {
   private static final float a = 12.25F;
   private static final aku<dak> b = aky.a(csw.class, akw.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public csw(bxn<? extends csw> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public csw(dkj $$0, double $$1, double $$2, double $$3) {
      this(bxn.X, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(dak $$0) {
      if ($$0.f()) {
         this.ar().a(b, this.g());
      } else {
         this.ar().a(b, $$0.c(1));
      }
   }

   @Override
   public dak f() {
      return this.ar().a(b);
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(b, this.g());
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

   public void a(iw $$0) {
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
   public void k(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.w((float)(azz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.x((float)(azz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dL();
         this.O = this.dN();
      }
   }

   @Override
   public void h() {
      super.h();
      fgc $$0 = this.dy();
      double $$1 = this.dA() + $$0.d;
      double $$2 = this.dC() + $$0.e;
      double $$3 = this.dG() + $$0.f;
      double $$4 = $$0.i();
      this.x(ctd.f(this.O, (float)(azz.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.w(ctd.f(this.N, (float)(azz.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dV().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azz.d($$6, $$5);
         double $$9 = azz.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dC() < this.d ? 1 : -1;
         $$0 = new fgc(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.i($$0);
      }

      float $$12 = 0.25F;
      if (this.bi()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dV().a(lz.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dV()
            .a(lz.af, $$1 - $$0.d * 0.25 + this.ae.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.ae.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dV().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dV().C) {
            this.a(awy.iF, 1.0F, 1.0F);
            this.aq();
            if (this.g) {
               this.dV().b(new coo(this.dV(), this.dA(), this.dC(), this.dG(), this.f()));
            } else {
               this.dV().c(2003, this.dv(), 0);
            }
         }
      } else {
         this.a_($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("Item", dak.b, $$1, this.f());
   }

   @Override
   public void a(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      this.a($$0.<dak>a("Item", dak.b, $$1).orElse(this.g()));
   }

   private dak g() {
      return new dak(dao.tA);
   }

   @Override
   public float bw() {
      return 1.0F;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }
}
