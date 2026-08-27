public class dce extends csk {
   public static final dgj d = dfz.aT;
   private final int e;

   protected dce(int $$0, dfi.d $$1, dfy $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cpv $$0, gw $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), biq.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return arw.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dfj $$0) {
      return $$0.c(d);
   }

   @Override
   protected dfj a(dfj $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d);
   }
}
