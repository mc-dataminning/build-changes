public class but {
   public static final float a = 20.0F;
   public static final float b = 25.0F;
   public static final float c = 2.0F;
   public static final float d = 0.2F;
   private static final int e = 4;

   public static float a(bxj $$0, float $$1, bux $$2, float $$3, float $$4) {
      float $$5 = 2.0F + $$4 / 4.0F;
      float $$6 = azm.a($$3 - $$1 / $$5, $$3 * 0.2F, 20.0F);
      float $$7 = $$6 / 25.0F;
      czk $$8 = $$2.e();
      float $$10;
      if ($$8 != null && $$0.dU() instanceof arq $$9) {
         $$10 = azm.a(dfz.c($$9, $$8, $$0, $$2, $$7), 0.0F, 1.0F);
      } else {
         $$10 = $$7;
      }

      float $$12 = 1.0F - $$10;
      return $$1 * $$12;
   }

   public static float a(float $$0, float $$1) {
      float $$2 = azm.a($$1, 0.0F, 20.0F);
      return $$0 * (1.0F - $$2 / 25.0F);
   }
}
