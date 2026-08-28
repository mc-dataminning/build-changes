public class cbt extends cch {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final che b;
   private final int c;
   private boolean d;

   public cbt(che $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.dZ().a(this.c) != 0) {
         return false;
      } else {
         jn $$0 = this.b.cP();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         ji $$3 = this.b.dw();

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
      return this.b.dW().b_($$4).a(awu.a) && !this.b.dW().a_($$4).d();
   }

   private boolean b(ji $$0, int $$1, int $$2, int $$3) {
      return this.b.dW().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.dW().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dz().e;
      return (!($$0 * $$0 < 0.03F) || this.b.dO() == 0.0F || !(Math.abs(this.b.dO()) < 10.0F) || !this.b.bj()) && !this.b.aJ();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      jn $$0 = this.b.cP();
      this.b.h(this.b.dz().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.L().m();
   }

   @Override
   public void e() {
      this.b.w(0.0F);
   }

   @Override
   public void a() {
      boolean $$0 = this.d;
      if (!$$0) {
         esx $$1 = this.b.dW().b_(this.b.dw());
         this.d = $$1.a(awu.a);
      }

      if (this.d && !$$0) {
         this.b.a(avz.hw, 1.0F, 1.0F);
      }

      fay $$2 = this.b.dz();
      if ($$2.e * $$2.e < 0.03F && this.b.dO() != 0.0F) {
         this.b.w(ayy.i(0.2F, this.b.dO(), 0.0F));
      } else if ($$2.g() > 1.0E-5F) {
         double $$3 = $$2.i();
         double $$4 = Math.atan2(-$$2.e, $$3) * 180.0F / (float)Math.PI;
         this.b.w((float)$$4);
      }
   }
}
