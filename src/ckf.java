public class ckf extends cjv {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cfv f = cfv.a().a(150.0);
   private final cfv g;
   private int h;

   public ckf(cjs $$0) {
      super($$0);
      this.g = cfv.a().a(20.0).a($$1 -> Math.abs($$1.dF() - $$0.dF()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      bve $$0 = this.a.dY().a(this.g, this.a, this.a.dD(), this.a.dF(), this.a.dJ());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gs().a(cki.h);
         } else {
            ezr $$1 = new ezr($$0.dD() - this.a.dD(), 0.0, $$0.dJ() - this.a.dJ()).d();
            ezr $$2 = new ezr((double)azn.a(this.a.dO() * (float) (Math.PI / 180.0)), 0.0, (double)(-azn.b(this.a.dO() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dD() - this.a.d.dD();
               double $$6 = $$0.dJ() - this.a.d.dJ();
               double $$7 = azn.a(azn.d(180.0 - azn.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dO()), -100.0, 100.0);
               this.a.ca *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.ca += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.v(this.a.dO() + this.a.ca);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dY().a(f, this.a, this.a.dD(), this.a.dF(), this.a.dJ());
         this.a.gs().a(cki.e);
         if ($$0 != null) {
            this.a.gs().a(cki.i);
            this.a.gs().b(cki.i).a(new ezr($$0.dD(), $$0.dF(), $$0.dJ()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cki<ckf> i() {
      return cki.g;
   }
}
