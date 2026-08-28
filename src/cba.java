public class cba extends cbo {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cgl b;
   private final int c;
   private boolean d;

   public cba(cgl $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.dV().a(this.c) != 0) {
         return false;
      } else {
         jk $$0 = this.b.cM();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         jf $$3 = this.b.ds();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(jf $$0, int $$1, int $$2, int $$3) {
      jf $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dS().b_($$4).a(axb.a) && !this.b.dS().a_($$4).d();
   }

   private boolean b(jf $$0, int $$1, int $$2, int $$3) {
      return this.b.dS().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).l() && this.b.dS().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).l();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.dv().e;
      return (!($$0 * $$0 < 0.03F) || this.b.dK() == 0.0F || !(Math.abs(this.b.dK()) < 10.0F) || !this.b.bi()) && !this.b.aH();
   }

   @Override
   public boolean T_() {
      return false;
   }

   @Override
   public void d() {
      jk $$0 = this.b.cM();
      this.b.h(this.b.dv().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
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
         eqt $$1 = this.b.dS().b_(this.b.ds());
         this.d = $$1.a(axb.a);
      }

      if (this.d && !$$0) {
         this.b.a(awg.hc, 1.0F, 1.0F);
      }

      eyw $$2 = this.b.dv();
      if ($$2.e * $$2.e < 0.03F && this.b.dK() != 0.0F) {
         this.b.w(azf.i(0.2F, this.b.dK(), 0.0F));
      } else if ($$2.g() > 1.0E-5F) {
         double $$3 = $$2.i();
         double $$4 = Math.atan2(-$$2.e, $$3) * 180.0F / (float)Math.PI;
         this.b.w((float)$$4);
      }
   }
}
