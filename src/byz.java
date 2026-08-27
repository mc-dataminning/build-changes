public class byz extends bfj implements bzd {
   private static final aby<cfz> b = acb.a(byz.class, aca.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public byz(bfn<? extends byz> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public byz(cmm $$0, double $$1, double $$2, double $$3) {
      this(bfn.K, $$0);
      this.e($$1, $$2, $$3);
   }

   public void a(cfz $$0) {
      if (!$$0.a(cgc.rD) || $$0.u()) {
         this.aj().b(b, $$0.c(1));
      }
   }

   private cfz k() {
      return this.aj().b(b);
   }

   @Override
   public cfz j() {
      cfz $$0 = this.k();
      return $$0.b() ? new cfz(cgc.rD) : $$0;
   }

   @Override
   protected void a_() {
      this.aj().a(b, cfz.b);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(gu $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dn();
      double $$5 = $$3 - this.dt();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dn() + $$4 / $$6 * 12.0;
         this.e = this.dt() + $$5 / $$6 * 12.0;
         this.d = this.dp() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.af.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.a_((float)(apa.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.b_((float)(apa.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.M = this.dy();
         this.N = this.dA();
      }
   }

   @Override
   public void l() {
      super.l();
      eei $$0 = this.dl();
      double $$1 = this.dn() + $$0.c;
      double $$2 = this.dp() + $$0.d;
      double $$3 = this.dt() + $$0.e;
      double $$4 = $$0.h();
      this.b_(bzg.d(this.N, (float)(apa.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.a_(bzg.d(this.M, (float)(apa.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dI().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)apa.d($$6, $$5);
         double $$9 = apa.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dp() < this.d ? 1 : -1;
         $$0 = new eei(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.f($$0);
      }

      float $$12 = 0.25F;
      if (this.aV()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dI().a(iv.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dI()
            .a(iv.X, $$1 - $$0.c * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.af.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dI().B) {
         this.e($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dI().B) {
            this.a(amh.ha, 1.0F, 1.0F);
            this.ai();
            if (this.g) {
               this.dI().b(new bvh(this.dI(), this.dn(), this.dp(), this.dt(), this.j()));
            } else {
               this.dI().c(2003, this.di(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(qr $$0) {
      cfz $$1 = this.k();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
      cfz $$1 = cfz.a($$0.p("Item"));
      this.a($$1);
   }

   @Override
   public float bj() {
      return 1.0F;
   }

   @Override
   public boolean cn() {
      return false;
   }
}
