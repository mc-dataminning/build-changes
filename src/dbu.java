public class dbu extends csa {
   public static final dfz d = dfp.aT;
   private final int e;

   protected dbu(int $$0, dey.d $$1, dfo $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cpl $$0, gu $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bii.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return arp.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dez $$0) {
      return $$0.c(d);
   }

   @Override
   protected dez a(dez $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d);
   }
}
