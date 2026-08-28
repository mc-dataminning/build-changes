public class cnh extends bst implements cnl {
   private static final akj<cuo> b = akn.a(cnh.class, akl.h);
   private double c;
   private double d;
   private double e;
   private int f;
   private boolean g;

   public cnh(bsz<? extends cnh> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cnh(dbx $$0, double $$1, double $$2, double $$3) {
      this(bsz.N, $$0);
      this.a_($$1, $$2, $$3);
   }

   public void a(cuo $$0) {
      if ($$0.e()) {
         this.ap().a(b, this.s());
      } else {
         this.ap().a(b, $$0.c(1));
      }
   }

   @Override
   public cuo p() {
      return this.ap().a(b);
   }

   @Override
   protected void a(akn.a $$0) {
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

   public void a(iz $$0) {
      double $$1 = (double)$$0.u();
      int $$2 = $$0.v();
      double $$3 = (double)$$0.w();
      double $$4 = $$1 - this.du();
      double $$5 = $$3 - this.dA();
      double $$6 = Math.sqrt($$4 * $$4 + $$5 * $$5);
      if ($$6 > 12.0) {
         this.c = this.du() + $$4 / $$6 * 12.0;
         this.e = this.dA() + $$5 / $$6 * 12.0;
         this.d = this.dw() + 8.0;
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
         this.r((float)(ayy.d($$0, $$2) * 180.0F / (float)Math.PI));
         this.s((float)(ayy.d($$1, $$3) * 180.0F / (float)Math.PI));
         this.O = this.dF();
         this.P = this.dH();
      }
   }

   @Override
   public void l() {
      super.l();
      evq $$0 = this.ds();
      double $$1 = this.du() + $$0.c;
      double $$2 = this.dw() + $$0.d;
      double $$3 = this.dA() + $$0.e;
      double $$4 = $$0.h();
      this.s(cno.d(this.P, (float)(ayy.d($$0.d, $$4) * 180.0F / (float)Math.PI)));
      this.r(cno.d(this.O, (float)(ayy.d($$0.c, $$0.e) * 180.0F / (float)Math.PI)));
      if (!this.dP().B) {
         double $$5 = this.c - $$1;
         double $$6 = this.e - $$3;
         float $$7 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6);
         float $$8 = (float)ayy.d($$6, $$5);
         double $$9 = ayy.d(0.0025, $$4, (double)$$7);
         double $$10 = $$0.d;
         if ($$7 < 1.0F) {
            $$9 *= 0.8;
            $$10 *= 0.8;
         }

         int $$11 = this.dw() < this.d ? 1 : -1;
         $$0 = new evq(Math.cos((double)$$8) * $$9, $$10 + ((double)$$11 - $$10) * 0.015F, Math.sin((double)$$8) * $$9);
         this.h($$0);
      }

      float $$12 = 0.25F;
      if (this.be()) {
         for (int $$13 = 0; $$13 < 4; $$13++) {
            this.dP().a(li.d, $$1 - $$0.c * 0.25, $$2 - $$0.d * 0.25, $$3 - $$0.e * 0.25, $$0.c, $$0.d, $$0.e);
         }
      } else {
         this.dP()
            .a(li.ac, $$1 - $$0.c * 0.25 + this.ah.j() * 0.6 - 0.3, $$2 - $$0.d * 0.25 - 0.5, $$3 - $$0.e * 0.25 + this.ah.j() * 0.6 - 0.3, $$0.c, $$0.d, $$0.e);
      }

      if (!this.dP().B) {
         this.a_($$1, $$2, $$3);
         this.f++;
         if (this.f > 80 && !this.dP().B) {
            this.a(avz.ih, 1.0F, 1.0F);
            this.ao();
            if (this.g) {
               this.dP().b(new cjg(this.dP(), this.du(), this.dw(), this.dA(), this.p()));
            } else {
               this.dP().c(2003, this.dp(), 0);
            }
         }
      } else {
         this.p($$1, $$2, $$3);
      }
   }

   @Override
   public void b(ur $$0) {
      $$0.a("Item", this.p().a(this.dR()));
   }

   @Override
   public void a(ur $$0) {
      if ($$0.b("Item", 10)) {
         this.a(cuo.a(this.dR(), (vo)$$0.p("Item")).orElse(this.s()));
      } else {
         this.a(this.s());
      }
   }

   private cuo s() {
      return new cuo(cur.ss);
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Override
   public boolean ct() {
      return false;
   }
}
