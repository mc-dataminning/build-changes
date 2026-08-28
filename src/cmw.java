public class cmw extends bsh implements cna {
   private static final ajp<cud> b = ajt.a(cmw.class, ajr.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cmw(bsn<? extends cmw> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cmw(dcg $$0, double $$1, double $$2, double $$3) {
      this(bsn.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cud $$0) {
      if ($$0.e()) {
         this.ar().a(b, this.s());
      } else {
         this.ar().a(b, $$0.c(1));
      }
   }

   @Override
   public cud p() {
      return this.ar().a(b);
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(b, this.s());
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cM().a() * 4.0;
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
      double $$4 = $$1 - this.dw();
      double $$5 = $$3 - this.dC();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.dw() + $$4 / $$6 * 12.0;
         this.e = this.dC() + $$5 / $$6 * 12.0;
         this.d = this.dy() + 8.0;
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
         this.O = this.dH();
         this.P = this.dJ();
      }
   }

   @Override
   public void l() {
      super.l();
      ewh $$0 = this.du();
      double $$1 = this.dw() + $$0.c;
      double $$2 = this.dy() + $$0.d;
      double $$3 = this.dC() + $$0.e;
      double $$4 = $$0.h();
      this.t(cnd.e(this.P, (float)(ayg.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.s(cnd.e(this.O, (float)(ayg.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dR().B) {
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

         int $$11 = this.dy() < this.d ? 1 : -1;
         $$0 = new ewh(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.j($$0);
      }

      float $$12 = 0.25F;
      if (this.bg()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dR().a(lj.d, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dR()
            .a(lj.ac, $$1 - $$0.c * 0.25 + this.ah.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ah.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dR().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dR().B) {
            this.a(avh.ih, 1.0F, 1.0F);
            this.aq();
            if (this.g) {
               this.dR().b(new civ(this.dR(), this.dw(), this.dy(), this.dC(), this.p()));
            } else {
               this.dR().c(2003, this.dr(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(tx $$0) {
      $$0.a("Item", this.p().a(this.dT()));
   }

   @Override
   public void a(tx $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cud.a(this.dT(), (uu)$$0.p("Item")).orElse(this.s()));
      } else {
         this.a(this.s());
      }
   }

   private cud s() {
      return new cud(cug.ss);
   }

   @Override
   public float bv() {
      return 1.0F;
   }

   @Override
   public boolean cv() {
      return false;
   }
}
