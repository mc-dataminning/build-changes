public class caa extends cao {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cfk b;
   private final int c;
   private boolean d;

   public caa(cfk $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.dT().a(this.c) != 0) {
         return false;
      } else {
         ji $$0 = this.b.cJ();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         jd $$3 = this.b.dq();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(jd $$0, int $$1, int $$2, int $$3) {
      jd $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dQ().b_($$4).a(awj.a) && !this.b.dQ().a_($$4).d();
   }

   private boolean b(jd $$0, int $$1, int $$2, int $$3) {
      return this.b.dQ().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dQ().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dt().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dI() == 0.0F || !(Math.abs(this.b.dI()) < 10.0F) || !this.b.bf()) && !this.b.aF();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void d() {
      ji $$0 = this.b.cJ();
      this.b.i(this.b.dt().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.J().n();
   }

   @Override
   public void e() {
      this.b.t(0.0F);
   }

   @Override
   public void a() {
      boolean $$0 = this.d;
      if (!$$0) {
         eoy $$1 = this.b.dQ().b_(this.b.dq());
         this.d = $$1.a(awj.a);
      }

      if (this.d && !$$0) {
         this.b.a(avo.hb, 1.0F, 1.0F);
      }

      eww $$2 = this.b.dt();
      if ($$2.d * $$2.d < 0.03F && this.b.dI() != 0.0F) {
         this.b.t(ayn.j(0.2F, this.b.dI(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.t((float)$$4);
      }
   }
}
