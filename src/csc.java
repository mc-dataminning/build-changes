public class csc extends crr {
   private static final alc<Boolean> c = alg.a(csc.class, ale.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public fbs b = fbs.c;

   public csc(bvm<? extends csc> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean E() {
      return true;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().B_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.b = fbs.c;
         }

         this.s(this.i > 0);
      }

      if (this.v() && this.ae.a(4) == 0) {
         this.dV().a(ls.Y, this.dA(), this.dC() + 0.8, this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(ash $$0) {
      return this.bj() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected cxg u() {
      return cxo.oh;
   }

   @Override
   public cxk dI() {
      return new cxk(cxo.oh);
   }

   @Override
   protected fbs a(fbs $$0) {
      fbs $$1;
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

   private fbs j(fbs $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bte a(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(ayd.bS) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.dt().d($$0.dt()).f();
      }

      return bte.a;
   }

   @Override
   protected void b(ux $$0) {
      super.b($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(ux $$0) {
      super.a($$0);
      double $$1 = $$0.k("PushX");
      double $$2 = $$0.k("PushZ");
      this.b = new fbs($$1, 0.0, $$2);
      this.i = $$0.g("Fuel");
   }

   protected boolean v() {
      return this.al.a(c);
   }

   protected void s(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public dxn w() {
      return dkg.cL.m().b(dnm.a, jm.c).b(dnm.b, Boolean.valueOf(this.v()));
   }
}
