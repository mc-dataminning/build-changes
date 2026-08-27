public class dbv extends csb {
   public static final dga d = dfq.aT;
   private final int e;

   protected dbv(int $$0, dez.d $$1, dfp $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cpm $$0, gu $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bii.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return arp.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dfa $$0) {
      return $$0.c(d);
   }

   @Override
   protected dfa a(dfa $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d);
   }
}
