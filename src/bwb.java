public class bwb extends bwp {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cbl b;
   private final int c;
   private boolean d;

   public bwb(cbl $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean a() {
      if (this.b.ei().a(this.c) != 0) {
         return false;
      } else {
         ih $$0 = this.b.cF();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         ib $$3 = this.b.dm();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(ib $$0, int $$1, int $$2, int $$3) {
      ib $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dM().b_($$4).a(aus.a) && !this.b.dM().a_($$4).d();
   }

   private boolean b(ib $$0, int $$1, int $$2, int $$3) {
      return this.b.dM().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dM().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean b() {
      double $$0 = this.b.dp().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dE() == 0.0F || !(Math.abs(this.b.dE()) < 10.0F) || !this.b.bc()) && !this.b.aC();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void c() {
      ih $$0 = this.b.cF();
      this.b.g(this.b.dp().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
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
         ein $$1 = this.b.dM().b_(this.b.dm());
         this.d = $$1.a(aus.a);
      }

      if (this.d && !$$0) {
         this.b.a(aty.gR, 1.0F, 1.0F);
      }

      epr $$2 = this.b.dp();
      if ($$2.d * $$2.d < 0.03F && this.b.dE() != 0.0F) {
         this.b.s(aww.j(0.2F, this.b.dE(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.s((float)$$4);
      }
   }
}
