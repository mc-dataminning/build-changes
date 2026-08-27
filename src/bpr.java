public class bpr extends bqf {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final buz b;
   private final int c;
   private boolean d;

   public bpr(buz $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.ef().a(this.c) != 0) {
         return false;
      } else {
         hc $$0 = this.b.cF();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         gw $$3 = this.b.dl();

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
      return this.b.dL().b_($$4).a(apy.a) && !this.b.dL().a_($$4).d();
   }

   private boolean b(gw $$0, int $$1, int $$2, int $$3) {
      return this.b.dL().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dL().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.do().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dD() == 0.0F || !(Math.abs(this.b.dD()) < 10.0F) || !this.b.aY()) && !this.b.aB();
   }

   @Override
   public boolean P_() {
      return false;
   }

   @Override
   public void c() {
      hc $$0 = this.b.cF();
      this.b.f(this.b.do().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.L().n();
   }

   @Override
   public void d() {
      this.b.s(0.0F);
   }

   @Override
   public void e() {
      boolean $$0 = this.d;
      if (!$$0) {
         eam $$1 = this.b.dL().b_(this.b.dl());
         this.d = $$1.a(apy.a);
      }

      if (this.d && !$$0) {
         this.b.a(ape.fV, 1.0F, 1.0F);
      }

      ehn $$2 = this.b.do();
      if ($$2.d * $$2.d < 0.03F && this.b.dD() != 0.0F) {
         this.b.s(arx.j(0.2F, this.b.dD(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.s((float)$$4);
      }
   }
}
