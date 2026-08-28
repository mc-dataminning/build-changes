public class clc extends cks {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cgp f = cgp.a().a(150.0);
   private final cgp g;
   private int h;

   public clc(ckp $$0) {
      super($$0);
      this.g = cgp.a().a(20.0).a(($$1, $$2) -> Math.abs($$1.dB() - $$0.dB()) <= 10.0);
   }

   @Override
   public void a(ard $$0) {
      this.h++;
      bvy $$1 = $$0.a(this.g, this.a, this.a.dz(), this.a.dB(), this.a.dF());
      if ($$1 != null) {
         if (this.h > 25) {
            this.a.t().a(clf.h);
         } else {
            fbx $$2 = new fbx($$1.dz() - this.a.dz(), 0.0, $$1.dF() - this.a.dF()).d();
            fbx $$3 = new fbx((double)ayz.a(this.a.dK() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayz.b(this.a.dK() * (float) (Math.PI / 180.0)))).d();
            float $$4 = (float)$$3.b($$2);
            float $$5 = (float)(Math.acos((double)$$4) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$5 < 0.0F || $$5 > 10.0F) {
               double $$6 = $$1.dz() - this.a.c.dz();
               double $$7 = $$1.dF() - this.a.c.dF();
               double $$8 = ayz.a(ayz.d(180.0 - ayz.d($$6, $$7) * 180.0F / (float)Math.PI - (double)this.a.dK()), -100.0, 100.0);
               this.a.bH *= 0.8F;
               float $$9 = (float)Math.sqrt($$6 * $$6 + $$7 * $$7) + 1.0F;
               float $$10 = $$9;
               if ($$9 > 40.0F) {
                  $$9 = 40.0F;
               }

               this.a.bH += (float)$$8 * (0.7F / $$9 / $$10);
               this.a.w(this.a.dK() + this.a.bH);
            }
         }
      } else if (this.h >= 100) {
         $$1 = $$0.a(f, this.a, this.a.dz(), this.a.dB(), this.a.dF());
         this.a.t().a(clf.e);
         if ($$1 != null) {
            this.a.t().a(clf.i);
            this.a.t().b(clf.i).a(new fbx($$1.dz(), $$1.dB(), $$1.dF()));
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
