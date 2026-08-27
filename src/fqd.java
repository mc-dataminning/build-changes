public class fqd implements fpz<dcu> {
   private final fua a;

   public fqd(fqa.a $$0) {
      this.a = $$0.d();
   }

   public void a(dcu $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      if ($$0.k() != null) {
         int $$6 = $$0.q().c(dfu.bv);
         if ($$6 > 0) {
            hc $$7 = $$0.f();
            if ($$7 != null) {
               cja $$8 = $$0.g();
               if (!$$8.b()) {
                  $$2.a();
                  $$2.a(0.0F, 0.5F, 0.0F);
                  float[] $$9 = this.a($$7, $$6);
                  $$2.a($$9[0], $$9[1], $$9[2]);
                  $$2.a(a.d.rotationDegrees(75.0F));
                  boolean $$10 = $$7 == hc.f || $$7 == hc.e;
                  $$2.a(a.d.rotationDegrees((float)(($$10 ? 90 : 0) + 11)));
                  $$2.b(0.5F, 0.5F, 0.5F);
                  int $$11 = fnx.a($$0.k(), $$0.q(), $$0.p().a($$7));
                  this.a.a($$8, cix.i, $$11, fyq.d, $$2, $$3, $$0.k(), 0);
                  $$2.b();
               }
            }
         }
      }
   }

   private float[] a(hc $$0, int $$1) {
      float[] $$2 = new float[]{0.5F, 0.0F, 0.5F};
      float $$3 = (float)$$1 / 10.0F * 0.75F;
      switch ($$0) {
         case f:
            $$2[0] = 0.73F + $$3;
            break;
         case e:
            $$2[0] = 0.25F - $$3;
            break;
         case b:
            $$2[1] = 0.25F + $$3;
            break;
         case a:
            $$2[1] = -0.23F - $$3;
            break;
         case c:
            $$2[2] = 0.25F - $$3;
            break;
         case d:
            $$2[2] = 0.73F + $$3;
      }

      return $$2;
   }
}
