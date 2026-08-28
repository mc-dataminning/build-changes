public class coj extends btr implements coo {
   private static final float b = 12.25F;
   private static final akh<cvs> c = akl.a(coj.class, akj.h);
   private double d;
   private double e;
   private double f;
   private int g;
   private boolean h;

   public coj(bty<? extends coj> $$0, dej $$1) {
      super($$0, $$1);
   }

   public coj(dej $$0, double $$1, double $$2, double $$3) {
      this(bty.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cvs $$0) {
      if ($$0.f()) {
         this.at().a(c, this.o());
      } else {
         this.at().a(c, $$0.c(1));
      }
   }

   @Override
   public cvs m() {
      return this.at().a(c);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(c, this.o());
   }

   @Override
   public boolean a(double $$0) {
      if (this.ag < 2 && $$0 < 12.25) {
         return false;
      } else {
         double $$1 = this.cO().a() * 4.0;
         if (Double.isNaN($$1)) {
            $$1 = 4.0;
         }

         $$1 *= 64.0;
         return $$0 < $$1 * $$1;
      }
   }

   public void a(jf $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dx();
      double $$5 = $$3 - this.dD();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.d = this.dx() + $$4 / $$6 * 12.0;
         this.f = this.dD() + $$5 / $$6 * 12.0;
         this.e = this.dz() + 8.0;
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
         this.v((float)(azf.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(azf.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dI();
         this.P = this.dK();
      }
   }

   @Override
   public void l() {
      super.l();
      eyw $$0 = this.dv();
      double $$1 = this.dx() + $$0.d;
      double $$2 = this.dz() + $$0.e;
      double $$3 = this.dD() + $$0.f;
      double $$4 = $$0.i();
      this.w(cor.e(this.P, (float)(azf.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(cor.e(this.O, (float)(azf.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dS().B) {
         double $$5 = this.d - $$1;
         double $$6 = this.f - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azf.d($$6, $$5);
         double $$9 = azf.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dz() < this.e ? 1 : -1;
         $$0 = new eyw(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.bi()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dS().a(lo.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dS()
            .a(lo.ac, $$1 - $$0.d * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.af.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dS().B) {
         this.a_($$1, $$2, $$3);
         this.g++;
         if (this.g > 80 && !this.dS().B) {
            this.a(awg.ii, 1.0F, 1.0F);
            this.as();
            if (this.h) {
               this.dS().b(new ckh(this.dS(), this.dx(), this.dz(), this.dD(), this.m()));
            } else {
               this.dS().c(2003, this.ds(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ug $$0) {
      $$0.a("Item", this.m().a(this.dU()));
   }

   @Override
   public void a(ug $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cvs.a(this.dU(), (vd)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cvs o() {
      return new cvs(cvw.st);
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Override
   public boolean cy() {
      return false;
   }
}
