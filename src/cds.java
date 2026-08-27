public class cds extends cdi {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final bzn f = bzn.a().a(150.0);
   private final bzn g;
   private int h;

   public cds(cdf $$0) {
      super($$0);
      this.g = bzn.a().a(20.0).a($$1 -> Math.abs($$1.dq() - $$0.dq()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      box $$0 = this.a.dJ().a(this.g, this.a, this.a.do(), this.a.dq(), this.a.du());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gi().a(cdv.h);
         } else {
            eov $$1 = new eov($$0.do() - this.a.do(), 0.0, $$0.du() - this.a.du()).d();
            eov $$2 = new eov((double)awm.a(this.a.dz() * (float) (Math.PI / 180.0)), 0.0, (double)(-awm.b(this.a.dz() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.do() - this.a.e.do();
               double $$6 = $$0.du() - this.a.e.du();
               double $$7 = awm.a(awm.d(180.0 - awm.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dz()), -100.0, 100.0);
               this.a.bY *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.bY += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dz() + this.a.bY);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dJ().a(f, this.a, this.a.do(), this.a.dq(), this.a.du());
         this.a.gi().a(cdv.e);
         if ($$0 != null) {
            this.a.gi().a(cdv.i);
            this.a.gi().b(cdv.i).a(new eov($$0.do(), $$0.dq(), $$0.du()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cdv<cds> i() {
      return cdv.g;
   }
}
