public class dcg extends csm {
   public static final dgl d = dgb.aT;
   private final int e;

   protected dcg(int $$0, dfk.d $$1, dga $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cpx $$0, gw $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bis.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return ary.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dfl $$0) {
      return $$0.c(d);
   }

   @Override
   protected dfl a(dfl $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d);
   }
}
