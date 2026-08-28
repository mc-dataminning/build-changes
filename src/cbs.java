public class cbs extends ccg {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final chd b;
   private final int c;
   private boolean d;

   public cbs(chd $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.eb().a(this.c) != 0) {
         return false;
      } else {
         jm $$0 = this.b.cR();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         jh $$3 = this.b.dy();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(jh $$0, int $$1, int $$2, int $$3) {
      jh $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dY().b_($$4).a(axj.a) && !this.b.dY().a_($$4).d();
   }

   private boolean b(jh $$0, int $$1, int $$2, int $$3) {
      return this.b.dY().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.dY().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dB().e;
      return (!($$0 * $$0 < 0.03F) || this.b.dQ() == 0.0F || !(Math.abs(this.b.dQ()) < 10.0F) || !this.b.bl()) && !this.b.aL();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      jm $$0 = this.b.cR();
      this.b.h(this.b.dB().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.P().o();
   }

   @Override
   public void e() {
      this.b.w(0.0F);
   }

   @Override
   public void a() {
      boolean $$0 = this.d;
      if (!$$0) {
         ero $$1 = this.b.dY().b_(this.b.dy());
         this.d = $$1.a(axj.a);
      }

      if (this.d && !$$0) {
         this.b.a(awo.hc, 1.0F, 1.0F);
      }

      ezr $$2 = this.b.dB();
      if ($$2.e * $$2.e < 0.03F && this.b.dQ() != 0.0F) {
         this.b.w(azn.i(0.2F, this.b.dQ(), 0.0F));
      } else if ($$2.g() > 1.0E-5F) {
         double $$3 = $$2.i();
         double $$4 = Math.atan2(-$$2.e, $$3) * 180.0F / (float)Math.PI;
         this.b.w((float)$$4);
      }
   }
}
