public final class dyf {
   private static final float a = 0.4F;
   private static final int b = 20;
   private static final double c = 0.2;
   private static final float d = 0.7F;
   private static final float e = 0.1F;
   private static final float f = 0.3F;
   private static final float g = 0.6F;
   private static final float h = 0.02F;
   private static final float i = -0.3F;

   private dyf() {
   }

   protected static dxz.c a(dxo $$0, dxo $$1, dxo $$2, dyi $$3) {
      dsd $$4 = null;
      return $$5 -> {
         double $$6 = $$0.a($$5);
         int $$7 = $$5.b();
         dyf.a $$8 = $$6 > 0.0 ? dyf.a.a : dyf.a.b;
         double $$9 = Math.abs($$6);
         int $$10 = $$8.d - $$7;
         int $$11 = $$7 - $$8.c;
         if ($$11 >= 0 && $$10 >= 0) {
            int $$12 = Math.min($$10, $$11);
            double $$13 = ayz.a((double)$$12, 0.0, 20.0, -0.2, 0.0);
            if ($$9 + $$13 < 0.4F) {
               return $$4;
            } else {
               azh $$14 = $$3.a($$5.a(), $$7, $$5.c());
               if ($$14.i() > 0.7F) {
                  return $$4;
               } else if ($$1.a($$5) >= 0.0) {
                  return $$4;
               } else {
                  double $$15 = ayz.a($$9, 0.4F, 0.6F, 0.1F, 0.3F);
                  if ((double)$$14.i() < $$15 && $$2.a($$5) > -0.3F) {
                     return $$14.i() < 0.02F ? $$8.f : $$8.e;
                  } else {
                     return $$8.g;
                  }
               }
            }
         } else {
            return $$4;
         }
      };
   }

   protected static enum a {
      a(dfc.ra.o(), dfc.tg.o(), dfc.c.o(), 0, 50),
      b(dfc.Q.o(), dfc.tf.o(), dfc.qz.o(), -60, -8);

      final dsd e;
      final dsd f;
      final dsd g;
      protected final int c;
      protected final int d;

      private a(final dsd $$0, final dsd $$1, final dsd $$2, final int $$3, final int $$4) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
         this.c = $$3;
         this.d = $$4;
      }
   }
}
