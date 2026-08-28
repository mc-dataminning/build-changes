public class cvg extends cuv {
   private static final aku<Boolean> c = aky.a(cvg.class, akw.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private static final short i = 0;
   private static final fgc j = fgc.c;
   private int k = 0;
   public fgc b = j;

   public cvg(bxn<? extends cvg> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean z() {
      return true;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, false);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().A_()) {
         if (this.k > 0) {
            this.k--;
         }

         if (this.k <= 0) {
            this.b = fgc.c;
         }

         this.q(this.k > 0);
      }

      if (this.q() && this.ae.a(4) == 0) {
         this.dV().a(lz.aa, this.dA(), this.dC() + 0.8, this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(asb $$0) {
      return this.bi() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected dag o() {
      return dao.ox;
   }

   @Override
   public dak dI() {
      return new dak(dao.ox);
   }

   @Override
   protected fgc a(fgc $$0) {
      fgc $$1;
      if (this.b.h() > 1.0E-7) {
         this.b = this.k($$0);
         $$1 = $$0.d(0.8, 0.0, 0.8).e(this.b);
         if (this.bi()) {
            $$1 = $$1.c(0.1);
         }
      } else {
         $$1 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$1);
   }

   private fgc k(fgc $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if ($$2.a(axv.bR) && this.k + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.k += 3600;
      }

      if (this.k > 0) {
         this.b = this.dt().d($$0.dt()).f();
      }

      return bvc.a;
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      $$0.a("PushX", this.b.d);
      $$0.a("PushZ", this.b.f);
      $$0.a("Fuel", (short)this.k);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      double $$1 = $$0.b("PushX", j.d);
      double $$2 = $$0.b("PushZ", j.f);
      this.b = new fgc($$1, 0.0, $$2);
      this.k = $$0.b("Fuel", (short)0);
   }

   protected boolean q() {
      return this.al.a(c);
   }

   protected void q(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public ebq v() {
      return dnq.cO.m().b(dqz.a, jc.c).b(dqz.b, Boolean.valueOf(this.q()));
   }
}
