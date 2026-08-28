public class cqi extends bvj implements cqm {
   private static final float a = 12.25F;
   private static final alc<cxo> b = alg.a(cqi.class, ale.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cqi(bvq<? extends cqi> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cqi(dhh $$0, double $$1, double $$2, double $$3) {
      this(bvq.X, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cxo $$0) {
      if ($$0.f()) {
         this.au().a(b, this.m());
      } else {
         this.au().a(b, $$0.c(1));
      }
   }

   @Override
   public cxo l() {
      return this.au().a(b);
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(b, this.m());
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

   public void a(jh $$0) {
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
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.v((float)(bae.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(bae.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dL();
         this.O = this.dN();
      }
   }

   @Override
   public void h() {
      super.h();
      fbx $$0 = this.dy();
      double $$1 = this.dA() + $$0.d;
      double $$2 = this.dC() + $$0.e;
      double $$3 = this.dG() + $$0.f;
      double $$4 = $$0.i();
      this.w(cqp.f(this.O, (float)(bae.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(cqp.f(this.N, (float)(bae.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dV().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)bae.d($$6, $$5);
         double $$9 = bae.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dC() < this.d ? 1 : -1;
         $$0 = new fbx(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.bj()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dV().a(ls.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dV()
            .a(ls.ad, $$1 - $$0.d * 0.25 + this.ae.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.ae.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dV().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dV().C) {
            this.a(axf.iB, 1.0F, 1.0F);
            this.at();
            if (this.g) {
               this.dV().b(new cma(this.dV(), this.dA(), this.dC(), this.dG(), this.l()));
            } else {
               this.dV().c(2003, this.dv(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ux $$0) {
      $$0.a("Item", this.l().a(this.dX()));
   }

   @Override
   public void a(ux $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cxo.a(this.dX(), (vu)$$0.p("Item")).orElse(this.m()));
      } else {
         this.a(this.m());
      }
   }

   private cxo m() {
      return new cxo(cxs.tg);
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public boolean cB() {
      return false;
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      return false;
   }
}
