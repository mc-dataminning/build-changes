public class cua extends ctp {
   private static final akj<Boolean> c = akn.a(cua.class, akl.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public feq b = feq.c;

   public cua(bwo<? extends cua> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().w_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.b = feq.c;
         }

         this.r(this.i > 0);
      }

      if (this.q() && this.ae.a(4) == 0) {
         this.dV().a(lx.aa, this.dA(), this.dC() + 0.8, this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(arq $$0) {
      return this.bj() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected cyz o() {
      return czh.ox;
   }

   @Override
   public czd dI() {
      return new czd(czh.ox);
   }

   @Override
   protected feq a(feq $$0) {
      feq $$1;
      if (this.b.h() > 1.0E-7) {
         this.b = this.k($$0);
         $$1 = $$0.d(0.8, 0.0, 0.8).e(this.b);
         if (this.bj()) {
            $$1 = $$1.c(0.1);
         }
      } else {
         $$1 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$1);
   }

   private feq k(feq $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bud a(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if ($$2.a(axk.bQ) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.dt().d($$0.dt()).f();
      }

      return bud.a;
   }

   @Override
   protected void b(tz $$0) {
      super.b($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(tz $$0) {
      super.a($$0);
      double $$1 = $$0.k("PushX");
      double $$2 = $$0.k("PushZ");
      this.b = new feq($$1, 0.0, $$2);
      this.i = $$0.g("Fuel");
   }

   protected boolean q() {
      return this.al.a(c);
   }

   protected void r(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public eah v() {
      return dmh.cO.m().b(dpq.a, ja.c).b(dpq.b, Boolean.valueOf(this.q()));
   }
}
