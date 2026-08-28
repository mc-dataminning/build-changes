public class cmv extends bsg implements cmz {
   private static final ajp<cuc> b = ajt.a(cmv.class, ajr.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cmv(bsm<? extends cmv> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cmv(dcf $$0, double $$1, double $$2, double $$3) {
      this(bsm.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cuc $$0) {
      if ($$0.e()) {
         this.aq().a(b, this.s());
      } else {
         this.aq().a(b, $$0.c(1));
      }
   }

   @Override
   public cuc p() {
      return this.aq().a(b);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(b, this.s());
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cL().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(ja $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dv();
      double $$5 = $$3 - this.dB();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dv() + $$4 / $$6 * 12.0;
         this.e = this.dB() + $$5 / $$6 * 12.0;
         this.d = this.dx() + 8.0;
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
         this.s((float)(ayg.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.t((float)(ayg.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dG();
         this.P = this.dI();
      }
   }

   @Override
   public void l() {
      super.l();
      ewf $$0 = this.dt();
      double $$1 = this.dv() + $$0.c;
      double $$2 = this.dx() + $$0.d;
      double $$3 = this.dB() + $$0.e;
      double $$4 = $$0.h();
      this.t(cnc.d(this.P, (float)(ayg.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.s(cnc.d(this.O, (float)(ayg.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dQ().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ayg.d($$6, $$5);
         double $$9 = ayg.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dx() < this.d ? 1 : -1;
         $$0 = new ewf(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.i($$0);
      }

      float $$12 = 0.25F;
      if (this.bf()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dQ().a(lj.d, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dQ()
            .a(lj.ac, $$1 - $$0.c * 0.25 + this.ah.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ah.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dQ().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dQ().B) {
            this.a(avh.ih, 1.0F, 1.0F);
            this.ap();
            if (this.g) {
               this.dQ().b(new ciu(this.dQ(), this.dv(), this.dx(), this.dB(), this.p()));
            } else {
               this.dQ().c(2003, this.dq(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Item", this.p().a(this.dS()));
   }

   @Override
   public void a(tx $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cuc.a(this.dS(), (uu)$$0.p("Item")).orElse(this.s()));
      } else {
         this.a(this.s());
      }
   }

   private cuc s() {
      return new cuc(cuf.ss);
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   public boolean cu() {
      return false;
   }
}
