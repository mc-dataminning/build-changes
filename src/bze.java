public class bze extends bzs {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final ceo b;
   private final int c;
   private boolean d;

   public bze(ceo $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.el().a(this.c) != 0) {
         return false;
      } else {
         it $$0 = this.b.cI();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         io $$3 = this.b.dp();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(io $$0, int $$1, int $$2, int $$3) {
      io $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dP().b_($$4).a(awc.a) && !this.b.dP().a_($$4).d();
   }

   private boolean b(io $$0, int $$1, int $$2, int $$3) {
      return this.b.dP().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dP().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.ds().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dH() == 0.0F || !(Math.abs(this.b.dH()) < 10.0F) || !this.b.be()) && !this.b.aE();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void c() {
      it $$0 = this.b.cI();
      this.b.g(this.b.ds().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
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
         emw $$1 = this.b.dP().b_(this.b.dp());
         this.d = $$1.a(awc.a);
      }

      if (this.d && !$$0) {
         this.b.a(avi.hb, 1.0F, 1.0F);
      }

      eum $$2 = this.b.ds();
      if ($$2.d * $$2.d < 0.03F && this.b.dH() != 0.0F) {
         this.b.s(ayf.j(0.2F, this.b.dH(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.s((float)$$4);
      }
   }
}
