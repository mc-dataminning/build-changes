public class cqp extends cqf {
   private static final akk<Boolean> e = ako.a(cqp.class, akm.k);
   private static final int i = 3600;
   private static final int j = 32000;
   private int k;
   public double c;
   public double d;

   public cqp(bug<? extends cqp> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cqp(dev $$0, double $$1, double $$2, double $$3) {
      super(bug.S, $$0, $$1, $$2, $$3);
   }

   @Override
   public cqf.a y() {
      return cqf.a.c;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dX().y_()) {
         if (this.k > 0) {
            this.k--;
         }

         if (this.k <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.s(this.k > 0);
      }

      if (this.E() && this.af.a(4) == 0) {
         this.dX().a(lq.X, this.dC(), this.dE() + 0.8, this.dI(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double t() {
      return this.bk() ? super.t() * 0.75 : super.t() * 0.5;
   }

   @Override
   protected cvt al_() {
      return cwb.nO;
   }

   @Override
   protected void v() {
      double $$0 = 1.0E-4;
      double $$1 = 0.001;
      super.v();
      ezh $$2 = this.dA();
      double $$3 = $$2.j();
      double $$4 = this.c * this.c + this.d * this.d;
      if ($$4 > 1.0E-4 && $$3 > 0.001) {
         double $$5 = Math.sqrt($$3);
         double $$6 = Math.sqrt($$4);
         this.c = $$2.d / $$5 * $$6;
         this.d = $$2.f / $$5 * $$6;
      }
   }

   @Override
   protected ezh a(ezh $$0) {
      double $$1 = this.c * this.c + this.d * this.d;
      ezh $$2;
      if ($$1 > 1.0E-7) {
         $$1 = Math.sqrt($$1);
         this.c /= $$1;
         this.d /= $$1;
         $$2 = $$0.d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.bk()) {
            $$2 = $$2.c(0.1);
         }
      } else {
         $$2 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$2);
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(axi.bN) && this.k + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.k += 3600;
      }

      if (this.k > 0) {
         this.c = this.dC() - $$0.dC();
         this.d = this.dI() - $$0.dI();
      }

      return bry.a;
   }

   @Override
   protected void b(uj $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.k);
   }

   @Override
   protected void a(uj $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.k = $$0.g("Fuel");
   }

   protected boolean E() {
      return this.am.a(e);
   }

   protected void s(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   public dvd A() {
      return dia.cD.m().b(dle.a, jl.c).b(dle.b, Boolean.valueOf(this.E()));
   }
}
