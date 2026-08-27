public class fnx extends fll {
   private static final int a = 12235202;

   protected fnx(fjr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, float $$7, fnl $$8) {
      super($$0, $$1, $$2, $$3, 0.1F, -0.1F, 0.1F, $$4, $$5, $$6, $$7, $$8, 0.0F, 20, 0.0125F, false);
      this.v = (float)asi.b.b(12235202) / 255.0F;
      this.w = (float)asi.b.c(12235202) / 255.0F;
      this.x = (float)asi.b.d(12235202) / 255.0F;
   }

   public static class a implements fmt<jv> {
      private final fnl a;

      public a(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jv $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         ate $$8 = $$1.z;
         double $$9 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         double $$10 = (double)$$8.i() * -0.5 * (double)$$8.i() * 0.1 * 5.0;
         double $$11 = (double)$$8.i() * -1.9 * (double)$$8.i() * 0.1;
         return new fnx($$1, $$2, $$3, $$4, $$9, $$10, $$11, 1.0F, this.a);
      }
   }
}
