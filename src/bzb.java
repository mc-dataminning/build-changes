public class bzb extends bzp {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cem b;
   private final int c;
   private boolean d;

   public bzb(cem $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.et().a(this.c) != 0) {
         return false;
      } else {
         iw $$0 = this.b.cN();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         ir $$3 = this.b.du();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(ir $$0, int $$1, int $$2, int $$3) {
      ir $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dU().b_($$4).a(awj.a) && !this.b.dU().a_($$4).d();
   }

   private boolean b(ir $$0, int $$1, int $$2, int $$3) {
      return this.b.dU().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dU().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.dx().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dM() == 0.0F || !(Math.abs(this.b.dM()) < 10.0F) || !this.b.bi()) && !this.b.aE();
   }

   @Override
   public boolean R_() {
      return false;
   }

   @Override
   public void c() {
      iw $$0 = this.b.cN();
      this.b.g(this.b.dx().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.J().n();
   }

   @Override
   public void d() {
      this.b.s(0.0F);
   }

   @Override
   public void e() {
      boolean $$0 = this.d;
      if (!$$0) {
         epe $$1 = this.b.dU().b_(this.b.du());
         this.d = $$1.a(awj.a);
      }

      if (this.d && !$$0) {
         this.b.a(avo.hb, 1.0F, 1.0F);
      }

      ewu $$2 = this.b.dx();
      if ($$2.d * $$2.d < 0.03F && this.b.dM() != 0.0F) {
         this.b.s(aym.j(0.2F, this.b.dM(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.s((float)$$4);
      }
   }
}
