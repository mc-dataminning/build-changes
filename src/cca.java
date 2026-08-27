public class cca extends bil implements cce {
   private static final aec<cja> b = aef.a(cca.class, aee.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cca(bip<? extends cca> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cca(cpq $$0, double $$1, double $$2, double $$3) {
      this(bip.K, $$0);
      this.e($$1, $$2, $$3);
   }

   public void a(cja $$0) {
      if (!$$0.a(cjd.rD) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   private cja m() {
      return this.al().b(b);
   }

   @Override
   public cja j() {
      cja $$0 = this.m();
      return $$0.b() ? new cja(cjd.rD) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, cja.b);
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(gw $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dp();
      double $$5 = $$3 - this.dv();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dp() + $$4 / $$6 * 12.0;
         this.e = this.dv() + $$5 / $$6 * 12.0;
         this.d = this.dr() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.ag.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.r((float)(ars.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(ars.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dA();
         this.O = this.dC();
      }
   }

   @Override
   public void l() {
      super.l();
      ehi $$0 = this.dn();
      double $$1 = this.dp() + $$0.c;
      double $$2 = this.dr() + $$0.d;
      double $$3 = this.dv() + $$0.e;
      double $$4 = $$0.h();
      this.s(cch.d(this.O, (float)(ars.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cch.d(this.N, (float)(ars.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dK().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ars.d($$6, $$5);
         double $$9 = ars.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dr() < this.d ? 1 : -1;
         $$0 = new ehi(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.f($$0);
      }

      float $$12 = 0.25F;
      if (this.aX()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dK().a(ix.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dK()
            .a(ix.X, $$1 - $$0.c * 0.25 + this.ag.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ag.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dK().B) {
         this.e($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dK().B) {
            this.a(aoz.ha, 1.0F, 1.0F);
            this.ak();
            if (this.g) {
               this.dK().b(new byi(this.dK(), this.dp(), this.dr(), this.dv(), this.j()));
            } else {
               this.dK().c(2003, this.dk(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(qu $$0) {
      cja $$1 = this.m();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qu()));
      }
   }

   @Override
   public void a(qu $$0) {
      cja $$1 = cja.a($$0.p("Item"));
      this.a($$1);
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   public boolean cp() {
      return false;
   }
}
