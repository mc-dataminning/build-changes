public class crf extends cqu {
   private static final ajx<Boolean> c = akb.a(crf.class, ajz.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public fay b = fay.c;

   public crf(buq<? extends crf> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean E() {
      return true;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dW().B_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.b = fay.c;
         }

         this.s(this.i > 0);
      }

      if (this.v() && this.ae.a(4) == 0) {
         this.dW().a(lt.Z, this.dB(), this.dD() + 0.8, this.dH(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(arc $$0) {
      return this.bj() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected cwj u() {
      return cwr.oq;
   }

   @Override
   public cwn dJ() {
      return new cwn(cwr.oq);
   }

   @Override
   protected fay a(fay $$0) {
      fay $$1;
      if (this.b.h() > 1.0E-7) {
         this.b = this.j($$0);
         $$1 = $$0.d(0.8, 0.0, 0.8).e(this.b);
         if (this.bj()) {
            $$1 = $$1.c(0.1);
         }
      } else {
         $$1 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$1);
   }

   private fay j(fay $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bsi a(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(awx.bP) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.du().d($$0.du()).f();
      }

      return bsi.a;
   }

   @Override
   protected void b(tq $$0) {
      super.b($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(tq $$0) {
      super.a($$0);
      double $$1 = $$0.k("PushX");
      double $$2 = $$0.k("PushZ");
      this.b = new fay($$1, 0.0, $$2);
      this.i = $$0.g("Fuel");
   }

   protected boolean v() {
      return this.al.a(c);
   }

   protected void s(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public dwv w() {
      return djm.cL.m().b(dms.a, jn.c).b(dms.b, Boolean.valueOf(this.v()));
   }
}
