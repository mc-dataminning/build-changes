public class cil extends bof implements cip {
   private static final aii<cpq> b = ail.a(cil.class, aik.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cil(bol<? extends cil> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cil(cwe $$0, double $$1, double $$2, double $$3) {
      this(bol.M, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cpq $$0) {
      this.an().b(b, $$0.c(1));
   }

   @Override
   public cpq q() {
      return this.an().b(b);
   }

   @Override
   protected void c_() {
      this.an().a(b, this.s());
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

   public void a(ib $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.do();
      double $$5 = $$3 - this.du();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.do() + $$4 / $$6 * 12.0;
         this.e = this.du() + $$5 / $$6 * 12.0;
         this.d = this.dq() + 8.0;
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
         this.r((float)(awm.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(awm.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.M = this.dz();
         this.N = this.dB();
      }
   }

   @Override
   public void l() {
      super.l();
      eov $$0 = this.dm();
      double $$1 = this.do() + $$0.c;
      double $$2 = this.dq() + $$0.d;
      double $$3 = this.du() + $$0.e;
      double $$4 = $$0.h();
      this.s(cis.d(this.N, (float)(awm.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cis.d(this.M, (float)(awm.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dJ().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)awm.d($$6, $$5);
         double $$9 = awm.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dq() < this.d ? 1 : -1;
         $$0 = new eov(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.g($$0);
      }

      float $$12 = 0.25F;
      if (this.aZ()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dJ().a(kb.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dJ()
            .a(kb.Z, $$1 - $$0.c * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.af.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dJ().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dJ().B) {
            this.a(atp.hT, 1.0F, 1.0F);
            this.am();
            if (this.g) {
               this.dJ().b(new cel(this.dJ(), this.do(), this.dq(), this.du(), this.q()));
            } else {
               this.dJ().c(2003, this.dj(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(sy $$0) {
      $$0.a("Item", this.q().b(new sy()));
   }

   @Override
   public void a(sy $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cpq.a($$0.p("Item")));
      } else {
         this.a(this.s());
      }
   }

   private cpq s() {
      return new cpq(cpt.sr);
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public boolean cn() {
      return false;
   }
}
