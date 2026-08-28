public class cdv extends cej {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cjm b;
   private final int c;
   private boolean d;

   public cdv(cjm $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.dX().a(this.c) != 0) {
         return false;
      } else {
         jb $$0 = this.b.cO();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         iv $$3 = this.b.du();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(iv $$0, int $$1, int $$2, int $$3) {
      iv $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dU().b_($$4).a(axh.a) && !this.b.dU().a_($$4).d();
   }

   private boolean b(iv $$0, int $$1, int $$2, int $$3) {
      return this.b.dU().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.dU().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dx().e;
      return (!($$0 * $$0 < 0.03F) || this.b.dM() == 0.0F || !(Math.abs(this.b.dM()) < 10.0F) || !this.b.bh()) && !this.b.aH();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void d() {
      jb $$0 = this.b.cO();
      this.b.i(this.b.dx().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.O().m();
   }

   @Override
   public void e() {
      this.b.x(0.0F);
   }

   @Override
   public void a() {
      boolean $$0 = this.d;
      if (!$$0) {
         exa $$1 = this.b.dU().b_(this.b.du());
         this.d = $$1.a(axh.a);
      }

      if (this.d && !$$0) {
         this.b.a(awn.hz, 1.0F, 1.0F);
      }

      ffc $$2 = this.b.dx();
      if ($$2.e * $$2.e < 0.03F && this.b.dM() != 0.0F) {
         this.b.x(azm.i(0.2F, this.b.dM(), 0.0F));
      } else if ($$2.g() > 1.0E-5F) {
         double $$3 = $$2.i();
         double $$4 = Math.atan2(-$$2.e, $$3) * 180.0F / (float)Math.PI;
         this.b.x((float)$$4);
      }
   }
}
