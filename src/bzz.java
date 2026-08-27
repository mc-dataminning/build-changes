public class bzz extends bzp {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final bvx f = bvx.a().a(150.0);
   private final bvx g;
   private int h;

   public bzz(bzm $$0) {
      super($$0);
      this.g = bvx.a().a(20.0).a($$1 -> Math.abs($$1.du() - $$0.du()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      bll $$0 = this.a.dN().a(this.g, this.a, this.a.ds(), this.a.du(), this.a.dy());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gc().a(cac.h);
         } else {
            ejz $$1 = new ejz($$0.ds() - this.a.ds(), 0.0, $$0.dy() - this.a.dy()).d();
            ejz $$2 = new ejz((double)atq.a(this.a.dD() * (float) (Math.PI / 180.0)), 0.0, (double)(-atq.b(this.a.dD() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.ds() - this.a.e.ds();
               double $$6 = $$0.dy() - this.a.e.dy();
               double $$7 = atq.a(atq.d(180.0 - atq.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dD()), -100.0, 100.0);
               this.a.bW *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.bW += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dD() + this.a.bW);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dN().a(f, this.a, this.a.ds(), this.a.du(), this.a.dy());
         this.a.gc().a(cac.e);
         if ($$0 != null) {
            this.a.gc().a(cac.i);
            this.a.gc().b(cac.i).a(new ejz($$0.ds(), $$0.du(), $$0.dy()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cac<bzz> i() {
      return cac.g;
   }
}
