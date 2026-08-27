public class cmj extends brv implements cmo {
   private static final ajy<cuh> b = akc.a(cmj.class, aka.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cmj(bsb<? extends cmj> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmj(dca $$0, double $$1, double $$2, double $$3) {
      this(bsb.P, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cuh $$0) {
      if ($$0.d()) {
         this.ap().a(b, this.r());
      } else {
         this.ap().a(b, $$0.c(1));
      }
   }

   @Override
   public cuh p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(b, this.r());
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cP().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(ir $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dz();
      double $$5 = $$3 - this.dF();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dz() + $$4 / $$6 * 12.0;
         this.e = this.dF() + $$5 / $$6 * 12.0;
         this.d = this.dB() + 8.0;
      } else {
         this.c = $$1;
         this.d = (double)$$2;
         this.e = $$3;
      }

      this.f = 0;
      this.g = this.al.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.Q == 0.0F && this.P == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.r((float)(aym.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(aym.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.P = this.dK();
         this.Q = this.dM();
      }
   }

   @Override
   public void l() {
      super.l();
      ewu $$0 = this.dx();
      double $$1 = this.dz() + $$0.c;
      double $$2 = this.dB() + $$0.d;
      double $$3 = this.dF() + $$0.e;
      double $$4 = $$0.h();
      this.s(cms.d(this.Q, (float)(aym.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cms.d(this.P, (float)(aym.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dU().C) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)aym.d($$6, $$5);
         double $$9 = aym.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dB() < this.d ? 1 : -1;
         $$0 = new ewu(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.g($$0);
      }

      float $$12 = 0.25F;
      if (this.bi()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dU().a(lb.d, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dU()
            .a(lb.aa, $$1 - $$0.c * 0.25 + this.al.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.al.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dU().C) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dU().C) {
            this.a(avo.iu, 1.0F, 1.0F);
            this.ao();
            if (this.g) {
               this.dU().b(new cig(this.dU(), this.dz(), this.dB(), this.dF(), this.p()));
            } else {
               this.dU().c(2003, this.du(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(uk $$0) {
      $$0.a("Item", this.p().a(this.dY()));
   }

   @Override
   public void a(uk $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cuh.a(this.dY(), (vh)$$0.p("Item")).orElse(this.r()));
      } else {
         this.a(this.r());
      }
   }

   private cuh r() {
      return new cuh(cuk.tP);
   }

   @Override
   public float by() {
      return 1.0F;
   }

   @Override
   public boolean cy() {
      return false;
   }
}
