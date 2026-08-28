public class cbw extends cck {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final chh b;
   private final int c;
   private boolean d;

   public cbw(chh $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.dY().a(this.c) != 0) {
         return false;
      } else {
         jn $$0 = this.b.cP();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         ji $$3 = this.b.dv();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(ji $$0, int $$1, int $$2, int $$3) {
      ji $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dV().b_($$4).a(awv.a) && !this.b.dV().a_($$4).d();
   }

   private boolean b(ji $$0, int $$1, int $$2, int $$3) {
      return this.b.dV().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.dV().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dy().e;
      return (!($$0 * $$0 < 0.03F) || this.b.dN() == 0.0F || !(Math.abs(this.b.dN()) < 10.0F) || !this.b.bj()) && !this.b.aJ();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      jn $$0 = this.b.cP();
      this.b.i(this.b.dy().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.P().m();
   }

   @Override
   public void e() {
      this.b.w(0.0F);
   }

   @Override
   public void a() {
      boolean $$0 = this.d;
      if (!$$0) {
         eta $$1 = this.b.dV().b_(this.b.dv());
         this.d = $$1.a(awv.a);
      }

      if (this.d && !$$0) {
         this.b.a(awa.hw, 1.0F, 1.0F);
      }

      fbb $$2 = this.b.dy();
      if ($$2.e * $$2.e < 0.03F && this.b.dN() != 0.0F) {
         this.b.w(ayz.i(0.2F, this.b.dN(), 0.0F));
      } else if ($$2.g() > 1.0E-5F) {
         double $$3 = $$2.i();
         double $$4 = Math.atan2(-$$2.e, $$3) * 180.0F / (float)Math.PI;
         this.b.w((float)$$4);
      }
   }
}
