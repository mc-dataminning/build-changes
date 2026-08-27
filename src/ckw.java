public class ckw extends bql implements cla {
   private static final ajk<csd> b = ajo.a(ckw.class, ajm.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public ckw(bqr<? extends ckw> $$0, czu $$1) {
      super($$0, $$1);
   }

   public ckw(czu $$0, double $$1, double $$2, double $$3) {
      this(bqr.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(csd $$0) {
      if ($$0.d()) {
         this.an().a(b, this.r());
      } else {
         this.an().a(b, $$0.c(1));
      }
   }

   @Override
   public csd p() {
      return this.an().a(b);
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(b, this.r());
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cI().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(im $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.ds();
      double $$5 = $$3 - this.dy();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.ds() + $$4 / $$6 * 12.0;
         this.e = this.dy() + $$5 / $$6 * 12.0;
         this.d = this.du() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.ah.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.r((float)(axw.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(axw.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dD();
         this.P = this.dF();
      }
   }

   @Override
   public void l() {
      super.l();
      etf $$0 = this.dq();
      double $$1 = this.ds() + $$0.c;
      double $$2 = this.du() + $$0.d;
      double $$3 = this.dy() + $$0.e;
      double $$4 = $$0.h();
      this.s(cld.d(this.P, (float)(axw.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cld.d(this.O, (float)(axw.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dN().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)axw.d($$6, $$5);
         double $$9 = axw.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.du() < this.d ? 1 : -1;
         $$0 = new etf(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.g($$0);
      }

      float $$12 = 0.25F;
      if (this.bc()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dN().a(kw.d, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dN()
            .a(kw.Z, $$1 - $$0.c * 0.25 + this.ah.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ah.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dN().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dN().B) {
            this.a(auz.ic, 1.0F, 1.0F);
            this.am();
            if (this.g) {
               this.dN().b(new cgv(this.dN(), this.ds(), this.du(), this.dy(), this.p()));
            } else {
               this.dN().c(2003, this.dn(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ty $$0) {
      $$0.a("Item", this.p().a(this.dP()));
   }

   @Override
   public void a(ty $$0) {
      if ($$0.b("Item", 10)) {
         this.a(csd.a(this.dP(), (uv)$$0.p("Item")).orElse(this.r()));
      } else {
         this.a(this.r());
      }
   }

   private csd r() {
      return new csd(csg.ss);
   }

   @Override
   public float br() {
      return 1.0F;
   }

   @Override
   public boolean cr() {
      return false;
   }
}
