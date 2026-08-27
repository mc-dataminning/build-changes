public class chw extends bnq implements cia {
   private static final aie<cpd> b = aih.a(chw.class, aig.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public chw(bnw<? extends chw> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public chw(cvr $$0, double $$1, double $$2, double $$3) {
      this(bnw.M, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cpd $$0) {
      if (!$$0.a(cpg.sr) || $$0.v()) {
         this.an().b(b, $$0.c(1));
      }
   }

   private cpd s() {
      return this.an().b(b);
   }

   @Override
   public cpd q() {
      cpd $$0 = this.s();
      return $$0.b() ? new cpd(cpg.sr) : $$0;
   }

   @Override
   protected void c_() {
      this.an().a(b, cpd.h);
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

   public void a(hz $$0) {
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
      this.g = this.af.a(5) > 0;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.o($$0, $$1, $$2);
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.r((float)(awi.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(awi.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.M = this.dC();
         this.N = this.dE();
      }
   }

   @Override
   public void l() {
      super.l();
      enz $$0 = this.dp();
      double $$1 = this.dr() + $$0.c;
      double $$2 = this.dt() + $$0.d;
      double $$3 = this.dx() + $$0.e;
      double $$4 = $$0.h();
      this.s(cid.d(this.N, (float)(awi.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cid.d(this.M, (float)(awi.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dM().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)awi.d($$6, $$5);
         double $$9 = awi.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dt() < this.d ? 1 : -1;
         $$0 = new enz(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.g($$0);
      }

      float $$12 = 0.25F;
      if (this.aZ()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dM().a(jz.e, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dM()
            .a(jz.Z, $$1 - $$0.c * 0.25 + this.af.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.af.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dM().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dM().B) {
            this.a(atl.hT, 1.0F, 1.0F);
            this.am();
            if (this.g) {
               this.dM().b(new cdw(this.dM(), this.dr(), this.dt(), this.dx(), this.q()));
            } else {
               this.dM().c(2003, this.dm(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(sw $$0) {
      cpd $$1 = this.s();
      if (!$$1.b()) {
         $$0.a("Item", $$1.b(new sw()));
      }
   }

   @Override
   public void a(sw $$0) {
      cpd $$1 = cpd.a($$0.p("Item"));
      this.a($$1);
   }

   @Override
   public float bo() {
      return 1.0F;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
