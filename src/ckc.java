public class ckc extends cjt {
   private static final aii<Boolean> e = ail.a(ckc.class, aik.k);
   private int i;
   public double c;
   public double d;
   private static final csp j = csp.a(cpt.ov, cpt.ow);

   public ckc(bol<? extends ckc> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ckc(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.R, $$0, $$1, $$2, $$3);
   }

   @Override
   public cjt.a w() {
      return cjt.a.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dJ().y_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.p(this.i > 0);
      }

      if (this.C() && this.af.a(4) == 0) {
         this.dJ().a(kb.U, this.do(), this.dq() + 0.8, this.du(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double q() {
      return (this.aZ() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cpl ai_() {
      return cpt.nN;
   }

   @Override
   protected void c(ib $$0, dme $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      eov $$4 = this.dm();
      double $$5 = $$4.i();
      double $$6 = this.c * this.c + this.d * this.d;
      if ($$6 > 1.0E-4 && $$5 > 0.001) {
         double $$7 = Math.sqrt($$5);
         double $$8 = Math.sqrt($$6);
         this.c = $$4.c / $$7 * $$8;
         this.d = $$4.e / $$7 * $$8;
      }
   }

   @Override
   protected void u() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         eov $$1 = this.dm().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aZ()) {
            $$1 = $$1.a(0.1);
         }

         this.g($$1);
      } else {
         this.g(this.dm().d(0.98, 0.0, 0.98));
      }

      super.u();
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         if (!$$0.fW().d) {
            $$2.h(1);
         }

         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.do() - $$0.do();
         this.d = this.du() - $$0.du();
      }

      return bml.a(this.dJ().B);
   }

   @Override
   protected void b(sy $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(sy $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean C() {
      return this.am.b(e);
   }

   protected void p(boolean $$0) {
      this.am.b(e, $$0);
   }

   @Override
   public dme y() {
      return czh.cD.o().a(dcm.a, ih.c).a(dcm.b, Boolean.valueOf(this.C()));
   }
}
