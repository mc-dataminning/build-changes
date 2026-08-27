public class cjd extends bow implements cjh {
   private static final aim<cqk> b = aiq.a(cjd.class, aio.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cjd(bpc<? extends cjd> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public cjd(cwz $$0, double $$1, double $$2, double $$3) {
      this(bpc.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cqk $$0) {
      this.an().a(b, $$0.c(1));
   }

   @Override
   public cqk p() {
      return this.an().a(b);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(b, this.r());
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(ib $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dr();
      double $$5 = $$3 - this.dx();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dr() + $$4 / $$6 * 12.0;
         this.e = this.dx() + $$5 / $$6 * 12.0;
         this.d = this.dt() + 8.0;
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
         this.r((float)(aww.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(aww.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.N = this.dC();
         this.O = this.dE();
      }
   }

   @Override
   public void l() {
      super.l();
      epr $$0 = this.dp();
      double $$1 = this.dr() + $$0.c;
      double $$2 = this.dt() + $$0.d;
      double $$3 = this.dx() + $$0.e;
      double $$4 = $$0.h();
      this.s(cjk.d(this.O, (float)(aww.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cjk.d(this.N, (float)(aww.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dM().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)aww.d($$6, $$5);
         double $$9 = aww.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dt() < this.d ? 1 : -1;
         $$0 = new epr(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.g($$0);
      }

      float $$12 = 0.25F;
      if (this.bc()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dM().a(kc.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dM()
            .a(kc.aa, $$1 - $$0.c * 0.25 + this.ag.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ag.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dM().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dM().B) {
            this.a(aty.hW, 1.0F, 1.0F);
            this.am();
            if (this.g) {
               this.dM().b(new cfd(this.dM(), this.dr(), this.dt(), this.dx(), this.p()));
            } else {
               this.dM().c(2003, this.dm(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ta $$0) {
      $$0.a("Item", this.p().b(new ta()));
   }

   @Override
   public void a(ta $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cqk.a($$0.p("Item")));
      } else {
         this.a(this.r());
      }
   }

   private cqk r() {
      return new cqk(cqn.sr);
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
