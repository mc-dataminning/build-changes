public class bpm extends bqa {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final buu b;
   private final int c;
   private boolean d;

   public bpm(buu $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.ee().a(this.c) != 0) {
         return false;
      } else {
         hc $$0 = this.b.cE();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         gw $$3 = this.b.dk();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(gw $$0, int $$1, int $$2, int $$3) {
      gw $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dK().b_($$4).a(apt.a) && !this.b.dK().a_($$4).d();
   }

   private boolean b(gw $$0, int $$1, int $$2, int $$3) {
      return this.b.dK().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dK().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.dn().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dC() == 0.0F || !(Math.abs(this.b.dC()) < 10.0F) || !this.b.aX()) && !this.b.aA();
   }

   @Override
   public boolean J_() {
      return false;
   }

   @Override
   public void c() {
      hc $$0 = this.b.cE();
      this.b.f(this.b.dn().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.H().n();
   }

   @Override
   public void d() {
      this.b.s(0.0F);
   }

   @Override
   public void e() {
      boolean $$0 = this.d;
      if (!$$0) {
         eah $$1 = this.b.dK().b_(this.b.dk());
         this.d = $$1.a(apt.a);
      }

      if (this.d && !$$0) {
         this.b.a(aoz.fV, 1.0F, 1.0F);
      }

      ehi $$2 = this.b.dn();
      if ($$2.d * $$2.d < 0.03F && this.b.dC() != 0.0F) {
         this.b.s(ars.j(0.2F, this.b.dC(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.s((float)$$4);
      }
   }
}
