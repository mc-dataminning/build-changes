public class bml extends bmz {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final brt b;
   private final int c;
   private boolean d;

   public bml(brt $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.ec().a(this.c) != 0) {
         return false;
      } else {
         ha $$0 = this.b.cC();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         gu $$3 = this.b.di();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(gu $$0, int $$1, int $$2, int $$3) {
      gu $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dI().b_($$4).a(anb.a) && !this.b.dI().a_($$4).d();
   }

   private boolean b(gu $$0, int $$1, int $$2, int $$3) {
      return this.b.dI().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dI().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.dl().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dA() == 0.0F || !(Math.abs(this.b.dA()) < 10.0F) || !this.b.aV()) && !this.b.ay();
   }

   @Override
   public boolean J_() {
      return false;
   }

   @Override
   public void c() {
      ha $$0 = this.b.cC();
      this.b.f(this.b.dl().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.J().n();
   }

   @Override
   public void d() {
      this.b.b_(0.0F);
   }

   @Override
   public void e() {
      boolean $$0 = this.d;
      if (!$$0) {
         dxe $$1 = this.b.dI().b_(this.b.di());
         this.d = $$1.a(anb.a);
      }

      if (this.d && !$$0) {
         this.b.a(amh.fV, 1.0F, 1.0F);
      }

      eei $$2 = this.b.dl();
      if ($$2.d * $$2.d < 0.03F && this.b.dA() != 0.0F) {
         this.b.b_(apa.j(0.2F, this.b.dA(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.b_((float)$$4);
      }
   }
}
