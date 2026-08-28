public class cri extends cqx {
   private static final ajy<Boolean> c = akc.a(cri.class, aka.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private int i;
   public fbb b = fbb.c;

   public cri(but<? extends cri> $$0, dgj $$1) {
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
            this.b = fbb.c;
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
   protected cwm u() {
      return cwu.oq;
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.oq);
   }

   @Override
   protected fbb a(fbb $$0) {
      fbb $$1;
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

   private fbb k(fbb $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bsl a(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if ($$2.a(awy.bP) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.b = this.dt().d($$0.dt()).f();
      }

      return bsl.a;
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
      this.b = new fbb($$1, 0.0, $$2);
      this.i = $$0.g("Fuel");
   }

   protected boolean v() {
      return this.al.a(c);
   }

   protected void s(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public dwy w() {
      return djp.cL.m().b(dmv.a, jn.c).b(dmv.b, Boolean.valueOf(this.v()));
   }
}
