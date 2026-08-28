public class cob extends btj implements cof {
   private static final float b = 12.25F;
   private static final akg<cvl> c = akk.a(cob.class, aki.h);
   private double d;
   private double e;
   private double f;
   private int g;
   private boolean h;

   public cob(btq<? extends cob> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cob(dds $$0, double $$1, double $$2, double $$3) {
      this(btq.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cvl $$0) {
      if ($$0.f()) {
         this.at().a(c, this.o());
      } else {
         this.at().a(c, $$0.c(1));
      }
   }

   @Override
   public cvl m() {
      return this.at().a(c);
   }

   @Override
   protected void a(akk.a $$0) {
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

   public void a(je $$0) {
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
         this.v((float)(azc.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.w((float)(azc.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dI();
         this.P = this.dK();
      }
   }

   @Override
   public void l() {
      super.l();
      eye $$0 = this.dv();
      double $$1 = this.dx() + $$0.d;
      double $$2 = this.dz() + $$0.e;
      double $$3 = this.dD() + $$0.f;
      double $$4 = $$0.i();
      this.w(coi.e(this.P, (float)(azc.d($$0.e, $$4) * 180.0F / (float)Math.PI)));
      this.v(coi.e(this.O, (float)(azc.d($$0.d, $$0.f) * 180.0F / (float)Math.PI)));
      if (!this.dS().B) {
         double $$5 = this.d - $$1;
         double $$6 = this.f - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)azc.d($$6, $$5);
         double $$9 = azc.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.e;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dz() < this.e ? 1 : -1;
         $$0 = new eye(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.bi()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dS().a(ln.d, $$1 - $$0.d * 0.25, $$2 - $$0.e * 0.25, $$3 - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }
      } else {
         this.dS()
            .a(ln.ac, $$1 - $$0.d * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.e * 0.25 - 0.5, $$3 - $$0.f * 0.25 + this.af.j() * 0.6 - 0.3, $$0.d, $$0.e, $$0.f);
      }

      if (!this.dS().B) {
         this.a_($$1, $$2, $$3);
         this.g++;
         if (this.g > 80 && !this.dS().B) {
            this.a(awd.ii, 1.0F, 1.0F);
            this.as();
            if (this.h) {
               this.dS().b(new cjz(this.dS(), this.dx(), this.dz(), this.dD(), this.m()));
            } else {
               this.dS().c(2003, this.ds(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(uf $$0) {
      $$0.a("Item", this.m().a(this.dU()));
   }

   @Override
   public void a(uf $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cvl.a(this.dU(), (vc)$$0.p("Item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }
   }

   private cvl o() {
      return new cvl(cvo.st);
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
