public class cpd extends bui implements cph {
   private static final float b = 12.25F;
   private static final ako<cwf> c = aks.a(cpd.class, akq.h);
   private double d;
   private double e;
   private double f;
   private int g;
   private boolean h;

   public cpd(bup<? extends cpd> $$0, dff $$1) {
      super($$0, $$1);
   }

   public cpd(dff $$0, double $$1, double $$2, double $$3) {
      this(bup.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cwf $$0) {
      if ($$0.f()) {
         this.aw().a(c, this.o());
      } else {
         this.aw().a(c, $$0.c(1));
      }
   }

   @Override
   public cwf m() {
      return this.aw().a(c);
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(c, this.o());
   }

   @Override
   public boolean a(double $$0) {
      if (this.ag < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cT().a() * 4.0;
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
      double $$4 = $$1 - this.dD();
      double $$5 = $$3 - this.dJ();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.d = this.dD() + $$4 / $$6 * 12.0;
         this.f = this.dJ() + $$5 / $$6 * 12.0;
         this.e = this.dF() + 8.0;
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
         this.v((float)(azn.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(azn.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dO();
         this.P = this.dQ();
      }
   }

   @Override
   public void l() {
      super.l();
      ezr $$0 = this.dB();
      double $$1 = this.dD() + $$0.d;
      double $$2 = this.dF() + $$0.e;
      double $$3 = this.dJ() + $$0.f;
      double $$4 = $$0.i();
      this.w(cpk.e(this.P, (float)(azn.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(cpk.e(this.O, (float)(azn.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dY().C) {
         double $$5 = this.d - $$1;
         double $$6 = this.f - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azn.d($$6, $$5);
         double $$9 = azn.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dF() < this.e ? 1 : -1;
         $$0 = new ezr(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.bl()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dY().a(ls.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dY()
            .a(ls.ac, $$1 - $$0.d * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.af.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dY().C) {
         this.a_($$1, $$2, $$3);
         this.g++;
         if (this.g > 80 && !this.dY().C) {
            this.a(awo.ii, 1.0F, 1.0F);
            this.av();
            if (this.h) {
               this.dY().b(new ckz(this.dY(), this.dD(), this.dF(), this.dJ(), this.m()));
            } else {
               this.dY().c(2003, this.dy(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(un $$0) {
      $$0.a("Item", this.m().a(this.ea()));
   }

   @Override
   public void a(un $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cwf.a(this.ea(), (vk)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cwf o() {
      return new cwf(cwj.sJ);
   }

   @Override
   public float bA() {
      return 1.0F;
   }

   @Override
   public boolean cD() {
      return false;
   }
}
