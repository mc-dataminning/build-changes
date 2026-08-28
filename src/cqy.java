public class cqy extends cqo {
   private static final ako<Boolean> d = aks.a(cqy.class, akq.k);
   private static final int e = 3600;
   private static final int i = 32000;
   private int j;
   public ezr c;

   public cqy(bup<? extends cqy> $$0, dff $$1) {
      super($$0, $$1);
      this.c = ezr.c;
   }

   @Override
   public boolean E() {
      return true;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(d, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dY().y_()) {
         if (this.j > 0) {
            this.j--;
         }

         if (this.j <= 0) {
            this.c = ezr.c;
         }

         this.s(this.j > 0);
      }

      if (this.F() && this.af.a(4) == 0) {
         this.dY().a(ls.X, this.dD(), this.dF() + 0.8, this.dJ(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double t() {
      return this.bl() ? super.t() * 0.75 : super.t() * 0.5;
   }

   @Override
   protected cwb al_() {
      return cwj.nO;
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.nO);
   }

   @Override
   protected ezr a(ezr $$0) {
      ezr $$1;
      if (this.c.h() > 1.0E-7) {
         this.c = this.j($$0);
         $$1 = $$0.d(0.8, 0.0, 0.8).e(this.c);
         if (this.bl()) {
            $$1 = $$1.c(0.1);
         }
      } else {
         $$1 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$1);
   }

   private ezr j(ezr $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.c.j() > 1.0E-4 && $$0.j() > 0.001 ? this.c.i($$0).d().c(this.c.g()) : this.c;
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(axm.bR) && this.j + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.j += 3600;
      }

      if (this.j > 0) {
         this.c = this.dw().d($$0.dw()).f();
      }

      return bsh.a;
   }

   @Override
   protected void b(un $$0) {
      super.b($$0);
      $$0.a("PushX", this.c.d);
      $$0.a("PushZ", this.c.f);
      $$0.a("Fuel", (short)this.j);
   }

   @Override
   protected void a(un $$0) {
      super.a($$0);
      double $$1 = $$0.k("PushX");
      double $$2 = $$0.k("PushZ");
      this.c = new ezr($$1, 0.0, $$2);
      this.j = $$0.g("Fuel");
   }

   protected boolean F() {
      return this.am.a(d);
   }

   protected void s(boolean $$0) {
      this.am.a(d, $$0);
   }

   @Override
   public dvo z() {
      return dil.cD.m().b(dlp.a, jm.c).b(dlp.b, Boolean.valueOf(this.F()));
   }
}
