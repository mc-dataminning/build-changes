public class dbt extends crz {
   public static final dfy d = dfo.aT;
   private final int e;

   protected dbt(int $$0, dex.d $$1, dfn $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cpk $$0, gv $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), big.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return aro.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dey $$0) {
      return $$0.c(d);
   }

   @Override
   protected dey a(dey $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d);
   }
}
