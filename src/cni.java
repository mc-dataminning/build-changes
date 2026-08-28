public class cni extends bsr implements cnm {
   private static final ajw<cuq> b = aka.a(cni.class, ajy.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cni(bsx<? extends cni> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cni(dcw $$0, double $$1, double $$2, double $$3) {
      this(bsx.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cuq $$0) {
      if ($$0.e()) {
         this.ar().a(b, this.s());
      } else {
         this.ar().a(b, $$0.c(1));
      }
   }

   @Override
   public cuq p() {
      return this.ar().a(b);
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(b, this.s());
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   public void a(jd $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.dt();
      double $$5 = $$3 - this.dz();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dt() + $$4 / $$6 * 12.0;
         this.e = this.dz() + $$5 / $$6 * 12.0;
         this.d = this.dv() + 8.0;
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
      this.n($$0, $$1, $$2);
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         this.t((float)(ayo.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.u((float)(ayo.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dE();
         this.P = this.dG();
      }
   }

   @Override
   public void l() {
      super.l();
      exc $$0 = this.dr();
      double $$1 = this.dt() + $$0.c;
      double $$2 = this.dv() + $$0.d;
      double $$3 = this.dz() + $$0.e;
      double $$4 = $$0.h();
      this.u(cnp.e(this.P, (float)(ayo.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.t(cnp.e(this.O, (float)(ayo.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dO().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ayo.d($$6, $$5);
         double $$9 = ayo.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dv() < this.d ? 1 : -1;
         $$0 = new exc(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.i($$0);
      }

      float $$12 = 0.25F;
      if (this.bf()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dO().a(lm.d, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dO()
            .a(lm.ac, $$1 - $$0.c * 0.25 + this.ah.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ah.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dO().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dO().B) {
            this.a(avp.ih, 1.0F, 1.0F);
            this.aq();
            if (this.g) {
               this.dO().b(new cjh(this.dO(), this.dt(), this.dv(), this.dz(), this.p()));
            } else {
               this.dO().c(2003, this.do(), 0);
            }
         }
      } else {
         this.o($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ub $$0) {
      $$0.a("Item", this.p().a(this.dQ()));
   }

   @Override
   public void a(ub $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cuq.a(this.dQ(), (uy)$$0.p("Item")).orElse(this.s()));
      } else {
         this.a(this.s());
      }
   }

   private cuq s() {
      return new cuq(cut.ss);
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
