public class cyw extends cpc {
   public static final ddb d = dcr.aT;
   private final int e;

   protected cyw(int $$0, dca.d $$1, dcq $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Integer.valueOf(0)));
      this.e = $$0;
   }

   @Override
   protected int b(cmm $$0, gu $$1) {
      int $$2 = Math.min(a($$0, c.a($$1), bfj.class), this.e);
      if ($$2 > 0) {
         float $$3 = (float)Math.min(this.e, $$2) / (float)this.e;
         return apa.f($$3 * 15.0F);
      } else {
         return 0;
      }
   }

   @Override
   protected int g(dcb $$0) {
      return $$0.c(d);
   }

   @Override
   protected dcb a(dcb $$0, int $$1) {
      return $$0.a(d, Integer.valueOf($$1));
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d);
   }
}
