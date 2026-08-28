public class cre extends cqt {
   private static final akm<Boolean> c = akq.a(cre.class, ako.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public ezy b = ezy.c;

   public cre(bus<? extends cre> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean D() {
      return true;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().A_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.b = ezy.c;
         }

         this.s(this.i > 0);
      }

      if (this.u() && this.ae.a(4) == 0) {
         this.dV().a(ls.X, this.dA(), this.dC() + 0.8, this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(arp $$0) {
      return this.bj() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected cwi t() {
      return cwq.nO;
   }

   @Override
   public cwm dI() {
      return new cwm(cwq.nO);
   }

   @Override
   protected ezy a(ezy $$0) {
      ezy $$1;
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

   private ezy j(ezy $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bsk a(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(axl.bR) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.dt().d($$0.dt()).f();
      }

      return bsk.a;
   }

   @Override
   protected void b(ul $$0) {
      super.b($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(ul $$0) {
      super.a($$0);
      double $$1 = $$0.k("PushX");
      double $$2 = $$0.k("PushZ");
      this.b = new ezy($$1, 0.0, $$2);
      this.i = $$0.g("Fuel");
   }

   protected boolean u() {
      return this.al.a(c);
   }

   protected void s(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public dvv w() {
      return dis.cD.m().b(dlw.a, jm.c).b(dlw.b, Boolean.valueOf(this.u()));
   }
}
