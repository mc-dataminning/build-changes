public class clc extends cks {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cgs f = cgs.a().a(150.0);
   private final cgs g;
   private int h;

   public clc(ckp $$0) {
      super($$0);
      this.g = cgs.a().a(20.0).a(($$1, $$2) -> Math.abs($$1.dC() - $$0.dC()) <= 10.0);
   }

   @Override
   public void a(ash $$0) {
      this.h++;
      bwb $$1 = $$0.a(this.g, this.a, this.a.dA(), this.a.dC(), this.a.dG());
      if ($$1 != null) {
         if (this.h > 25) {
            this.a.gi().a(clf.h);
         } else {
            fbs $$2 = new fbs($$1.dA() - this.a.dA(), 0.0, $$1.dG() - this.a.dG()).d();
            fbs $$3 = new fbs((double)bae.a(this.a.dL() * (float) (Math.PI / 180.0)), 0.0, (double)(-bae.b(this.a.dL() * (float) (Math.PI / 180.0)))).d();
            float $$4 = (float)$$3.b($$2);
            float $$5 = (float)(Math.acos((double)$$4) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$5 < 0.0F || $$5 > 10.0F) {
               double $$6 = $$1.dA() - this.a.c.dA();
               double $$7 = $$1.dG() - this.a.c.dG();
               double $$8 = bae.a(bae.d(180.0 - bae.d($$6, $$7) * 180.0F / (float)Math.PI - (double)this.a.dL()), -100.0, 100.0);
               this.a.cb *= 0.8F;
               float $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0F;
               float $$10 = $$9;
               if ($$9 > 40.0F) {
                  $$9 = 40.0F;
               }

               this.a.cb += (float)$$8 * (0.7F / $$9 / $$10);
               this.a.v(this.a.dL() + this.a.cb);
            }
         }
      } else if (this.h >= 100) {
         $$1 = $$0.a(f, this.a, this.a.dA(), this.a.dC(), this.a.dG());
         this.a.gi().a(clf.e);
         if ($$1 != null) {
            this.a.gi().a(clf.i);
            this.a.gi().b(clf.i).a(new fbs($$1.dA(), $$1.dC(), $$1.dG()));
         }
      }
   }

   @Override
   public void c() {
      this.h = 0;
   }

   @Override
   public clf<clc> h() {
      return clf.g;
   }
}
