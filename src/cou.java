public class cou extends btz implements coy {
   private static final float b = 12.25F;
   private static final akk<cvx> c = ako.a(cou.class, akm.h);
   private double d;
   private double e;
   private double f;
   private int g;
   private boolean h;

   public cou(bug<? extends cou> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cou(dev $$0, double $$1, double $$2, double $$3) {
      this(bug.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cvx $$0) {
      if ($$0.f()) {
         this.av().a(c, this.o());
      } else {
         this.av().a(c, $$0.c(1));
      }
   }

   @Override
   public cvx m() {
      return this.av().a(c);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(c, this.o());
   }

   @Override
   public boolean a(double $$0) {
      if (this.ag < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cS().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(jg $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dC();
      double $$5 = $$3 - this.dI();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.d = this.dC() + $$4 / $$6 * 12.0;
         this.f = this.dI() + $$5 / $$6 * 12.0;
         this.e = this.dE() + 8.0;
      } else {
         this.d = $$1;
         this.e = (double)$$2;
         this.f = $$3;
      }

      this.g = 0;
      this.h = this.af.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.v((float)(azj.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(azj.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dN();
         this.P = this.dP();
      }
   }

   @Override
   public void l() {
      super.l();
      ezh $$0 = this.dA();
      double $$1 = this.dC() + $$0.d;
      double $$2 = this.dE() + $$0.e;
      double $$3 = this.dI() + $$0.f;
      double $$4 = $$0.i();
      this.w(cpb.e(this.P, (float)(azj.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(cpb.e(this.O, (float)(azj.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dX().C) {
         double $$5 = this.d - $$1;
         double $$6 = this.f - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azj.d($$6, $$5);
         double $$9 = azj.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dE() < this.e ? 1 : -1;
         $$0 = new ezh(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.bk()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dX().a(lq.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dX()
            .a(lq.ac, $$1 - $$0.d * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.af.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dX().C) {
         this.a_($$1, $$2, $$3);
         this.g++;
         if (this.g > 80 && !this.dX().C) {
            this.a(awk.ii, 1.0F, 1.0F);
            this.au();
            if (this.h) {
               this.dX().b(new ckq(this.dX(), this.dC(), this.dE(), this.dI(), this.m()));
            } else {
               this.dX().c(2003, this.dx(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(uj $$0) {
      $$0.a("Item", this.m().a(this.dZ()));
   }

   @Override
   public void a(uj $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cvx.a(this.dZ(), (vg)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cvx o() {
      return new cvx(cwb.st);
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Override
   public boolean cC() {
      return false;
   }
}
