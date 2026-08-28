public class crg extends cqv {
   private static final ajy<Boolean> c = akc.a(crg.class, aka.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public faz b = faz.c;

   public crg(bur<? extends crg> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean C() {
      return true;
   }

   @Override
   protected void a(akc.a $$0) {
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
            this.b = faz.c;
         }

         this.s(this.i > 0);
      }

      if (this.v() && this.ae.a(4) == 0) {
         this.dV().a(lt.Z, this.dA(), this.dC() + 0.8, this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(ard $$0) {
      return this.bj() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected cwk u() {
      return cws.oq;
   }

   @Override
   public cwo dI() {
      return new cwo(cws.oq);
   }

   @Override
   protected faz a(faz $$0) {
      faz $$1;
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

   private faz k(faz $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bsj a(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(awy.bP) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.dt().d($$0.dt()).f();
      }

      return bsj.a;
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
      this.b = new faz($$1, 0.0, $$2);
      this.i = $$0.g("Fuel");
   }

   protected boolean v() {
      return this.al.a(c);
   }

   protected void s(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public dww w() {
      return djn.cL.m().b(dmt.a, jn.c).b(dmt.b, Boolean.valueOf(this.v()));
   }
}
