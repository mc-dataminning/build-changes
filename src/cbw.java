public class cbw extends big implements cca {
   private static final adx<ciw> b = aea.a(cbw.class, adz.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cbw(bik<? extends cbw> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cbw(cpk $$0, double $$1, double $$2, double $$3) {
      this(bik.K, $$0);
      this.e($$1, $$2, $$3);
   }

   public void a(ciw $$0) {
      if (!$$0.a(ciz.rD) || $$0.u()) {
         this.al().b(b, $$0.c(1));
      }
   }

   private ciw m() {
      return this.al().b(b);
   }

   @Override
   public ciw j() {
      ciw $$0 = this.m();
      return $$0.b() ? new ciw(ciz.rD) : $$0;
   }

   @Override
   protected void a_() {
      this.al().a(b, ciw.b);
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

   public void a(gv $$0) {
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
         this.r((float)(aro.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(aro.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dA();
         this.O = this.dC();
      }
   }

   @Override
   public void l() {
      super.l();
      ehf $$0 = this.dn();
      double $$1 = this.dp() + $$0.c;
      double $$2 = this.dr() + $$0.d;
      double $$3 = this.dv() + $$0.e;
      double $$4 = $$0.h();
      this.s(ccd.d(this.O, (float)(aro.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(ccd.d(this.N, (float)(aro.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dK().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)aro.d($$6, $$5);
         double $$9 = aro.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dr() < this.d ? 1 : -1;
         $$0 = new ehf(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.f($$0);
      }

      float $$12 = 0.25F;
      if (this.aX()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dK().a(iw.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dK()
            .a(iw.X, $$1 - $$0.c * 0.25 + this.ag.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ag.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dK().B) {
         this.e($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dK().B) {
            this.a(aou.ha, 1.0F, 1.0F);
            this.ak();
            if (this.g) {
               this.dK().b(new bye(this.dK(), this.dp(), this.dr(), this.dv(), this.j()));
            } else {
               this.dK().c(2003, this.dk(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(qs $$0) {
      ciw $$1 = this.m();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new qs()));
      }
   }

   @Override
   public void a(qs $$0) {
      ciw $$1 = ciw.a($$0.p("Item"));
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
