public class cib extends chr {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cdt f = cdt.a().a(150.0);
   private final cdt g;
   private int h;

   public cib(cho $$0) {
      super($$0);
      this.g = cdt.a().a(20.0).a($$1 -> Math.abs($$1.dy() - $$0.dy()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      btc $$0 = this.a.dR().a(this.g, this.a, this.a.dw(), this.a.dy(), this.a.dC());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gk().a(cie.h);
         } else {
            ewh $$1 = new ewh($$0.dw() - this.a.dw(), 0.0, $$0.dC() - this.a.dC()).d();
            ewh $$2 = new ewh((double)ayg.a(this.a.dH() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayg.b(this.a.dH() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dw() - this.a.e.dw();
               double $$6 = $$0.dC() - this.a.e.dC();
               double $$7 = ayg.a(ayg.d(180.0 - ayg.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dH()), -100.0, 100.0);
               this.a.cd *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.cd += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.s(this.a.dH() + this.a.cd);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dR().a(f, this.a, this.a.dw(), this.a.dy(), this.a.dC());
         this.a.gk().a(cie.e);
         if ($$0 != null) {
            this.a.gk().a(cie.i);
            this.a.gk().b(cie.i).a(new ewh($$0.dw(), $$0.dy(), $$0.dC()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cie<cib> i() {
      return cie.g;
   }
}
