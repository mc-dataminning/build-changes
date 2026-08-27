public final class dxd {
   private static final float a = 0.4F;
   private static final int b = 20;
   private static final double c = 0.2;
   private static final float d = 0.7F;
   private static final float e = 0.1F;
   private static final float f = 0.3F;
   private static final float g = 0.6F;
   private static final float h = 0.02F;
   private static final float i = -0.3F;

   private dxd() {
   }

   protected static dwx.c a(dwm $$0, dwm $$1, dwm $$2, dxg $$3) {
      drb $$4 = null;
      return $$5 -> {
         double $$6 = $$0.a($$5);
         int $$7 = $$5.b();
         dxd.a $$8 = $$6 > 0.0 ? dxd.a.a : dxd.a.b;
         double $$9 = Math.abs($$6);
         int $$10 = $$8.d - $$7;
         int $$11 = $$7 - $$8.c;
         if ($$11 >= 0 && $$10 >= 0) {
            int $$12 = Math.min($$10, $$11);
            double $$13 = ayd.a((double)$$12, 0.0, 20.0, -0.2, 0.0);
            if ($$9 + $$13 < 0.4F) {
               return $$4;
            } else {
               ayk $$14 = $$3.a($$5.a(), $$7, $$5.c());
               if ($$14.i() > 0.7F) {
                  return $$4;
               } else if ($$1.a($$5) >= 0.0) {
                  return $$4;
               } else {
                  double $$15 = ayd.a($$9, 0.4F, 0.6F, 0.1F, 0.3F);
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
      a(dea.ra.n(), dea.tg.n(), dea.c.n(), 0, 50),
      b(dea.Q.n(), dea.tf.n(), dea.qz.n(), -60, -8);

      final drb e;
      final drb f;
      final drb g;
      protected final int c;
      protected final int d;

      private a(drb $$0, drb $$1, drb $$2, int $$3, int $$4) {
         this.e = $$0;
         this.f = $$1;
         this.g = $$2;
         this.c = $$3;
         this.d = $$4;
      }
   }
}
