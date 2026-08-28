public class cbj extends cbx {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cgu b;
   private final int c;
   private boolean d;

   public cbj(cgu $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.ea().a(this.c) != 0) {
         return false;
      } else {
         jl $$0 = this.b.cQ();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         jg $$3 = this.b.dx();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(jg $$0, int $$1, int $$2, int $$3) {
      jg $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dX().b_($$4).a(axf.a) && !this.b.dX().a_($$4).d();
   }

   private boolean b(jg $$0, int $$1, int $$2, int $$3) {
      return this.b.dX().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.dX().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dA().e;
      return (!($$0 * $$0 < 0.03F) || this.b.dP() == 0.0F || !(Math.abs(this.b.dP()) < 10.0F) || !this.b.bk()) && !this.b.aJ();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      jl $$0 = this.b.cQ();
      this.b.h(this.b.dA().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
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
         ere $$1 = this.b.dX().b_(this.b.dx());
         this.d = $$1.a(axf.a);
      }

      if (this.d && !$$0) {
         this.b.a(awk.hc, 1.0F, 1.0F);
      }

      ezh $$2 = this.b.dA();
      if ($$2.e * $$2.e < 0.03F && this.b.dP() != 0.0F) {
         this.b.w(azj.i(0.2F, this.b.dP(), 0.0F));
      } else if ($$2.g() > 1.0E-5F) {
         double $$3 = $$2.i();
         double $$4 = Math.atan2(-$$2.e, $$3) * 180.0F / (float)Math.PI;
         this.b.w((float)$$4);
      }
   }
}
