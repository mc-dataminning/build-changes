public class cux extends cum {
   private static final akn<Boolean> c = akr.a(cux.class, akp.k);
   private static final int d = 3600;
   private static final int h = 32000;
   private static final short i = 0;
   private static final ffs j = ffs.c;
   private int k = 0;
   public ffs b = j;

   public cux(bxe<? extends cux> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean z() {
      return true;
   }

   @Override
   protected void a(akr.a $$0) {
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
            this.b = ffs.c;
         }

         this.q(this.k > 0);
      }

      if (this.q() && this.ae.a(4) == 0) {
         this.dV().a(lz.aa, this.dA(), this.dC() + 0.8, this.dG(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double a(aru $$0) {
      return this.bi() ? super.a($$0) * 0.75 : super.a($$0) * 0.5;
   }

   @Override
   protected czw o() {
      return dae.ox;
   }

   @Override
   public daa dI() {
      return new daa(dae.ox);
   }

   @Override
   protected ffs a(ffs $$0) {
      ffs $$1;
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

   private ffs k(ffs $$0) {
      double $$1 = 1.0E-4;
      double $$2 = 0.001;
      return this.b.j() > 1.0E-4 && $$0.j() > 0.001 ? this.b.i($$0).d().c(this.b.g()) : this.b;
   }

   @Override
   public but a(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if ($$2.a(axo.bR) && this.k + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.k += 3600;
      }

      if (this.k > 0) {
         this.b = this.dt().d($$0.dt()).f();
      }

      return but.a;
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
      this.b = new ffs($$1, 0.0, $$2);
      this.k = $$0.b("Fuel", (short)0);
   }

   protected boolean q() {
      return this.al.a(c);
   }

   protected void q(boolean $$0) {
      this.al.a(c, $$0);
   }

   @Override
   public ebg v() {
      return dng.cO.m().b(dqp.a, jc.c).b(dqp.b, Boolean.valueOf(this.q()));
   }
}
