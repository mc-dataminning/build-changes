public class cls extends brh implements clw {
   private static final ajm<csz> b = ajq.a(cls.class, ajo.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cls(brn<? extends cls> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cls(dad $$0, double $$1, double $$2, double $$3) {
      this(brn.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(csz $$0) {
      if ($$0.d()) {
         this.an().a(b, this.r());
      } else {
         this.an().a(b, $$0.c(1));
      }
   }

   @Override
   public csz p() {
      return this.an().a(b);
   }

   @Override
   protected void a(ajq.a $$0) {
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

   public void a(in $$0) {
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
         this.r((float)(axz.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(axz.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dD();
         this.P = this.dF();
      }
   }

   @Override
   public void l() {
      super.l();
      etp $$0 = this.dq();
      double $$1 = this.ds() + $$0.c;
      double $$2 = this.du() + $$0.d;
      double $$3 = this.dy() + $$0.e;
      double $$4 = $$0.h();
      this.s(clz.d(this.P, (float)(axz.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(clz.d(this.O, (float)(axz.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dN().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)axz.d($$6, $$5);
         double $$9 = axz.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.du() < this.d ? 1 : -1;
         $$0 = new etp(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.g($$0);
      }

      float $$12 = 0.25F;
      if (this.bc()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dN().a(kx.d, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dN()
            .a(kx.Z, $$1 - $$0.c * 0.25 + this.ah.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ah.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dN().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dN().B) {
            this.a(avc.ic, 1.0F, 1.0F);
            this.am();
            if (this.g) {
               this.dN().b(new chr(this.dN(), this.ds(), this.du(), this.dy(), this.p()));
            } else {
               this.dN().c(2003, this.dn(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ua $$0) {
      $$0.a("Item", this.p().a(this.dP()));
   }

   @Override
   public void a(ua $$0) {
      if ($$0.b("Item", 10)) {
         this.a(csz.a(this.dP(), (ux)$$0.p("Item")).orElse(this.r()));
      } else {
         this.a(this.r());
      }
   }

   private csz r() {
      return new csz(ctc.ss);
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
