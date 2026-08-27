public class byn extends bzb {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cdx b;
   private final int c;
   private boolean d;

   public byn(cdx $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.ej().a(this.c) != 0) {
         return false;
      } else {
         is $$0 = this.b.cG();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         in $$3 = this.b.dn();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(in $$0, int $$1, int $$2, int $$3) {
      in $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dN().b_($$4).a(avw.a) && !this.b.dN().a_($$4).d();
   }

   private boolean b(in $$0, int $$1, int $$2, int $$3) {
      return this.b.dN().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dN().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.dq().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dF() == 0.0F || !(Math.abs(this.b.dF()) < 10.0F) || !this.b.bc()) && !this.b.aC();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void c() {
      is $$0 = this.b.cG();
      this.b.g(this.b.dq().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.K().n();
   }

   @Override
   public void d() {
      this.b.s(0.0F);
   }

   @Override
   public void e() {
      boolean $$0 = this.d;
      if (!$$0) {
         ema $$1 = this.b.dN().b_(this.b.dn());
         this.d = $$1.a(avw.a);
      }

      if (this.d && !$$0) {
         this.b.a(avc.gW, 1.0F, 1.0F);
      }

      etp $$2 = this.b.dq();
      if ($$2.d * $$2.d < 0.03F && this.b.dF() != 0.0F) {
         this.b.s(axz.j(0.2F, this.b.dF(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.s((float)$$4);
      }
   }
}
