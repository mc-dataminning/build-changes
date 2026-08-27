public class cpi extends cre {
   public static final int a = 3;
   public static final ddb b = dcr.as;
   private static final efb[] e = new efb[]{
      cpn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   public cpi(dca.d $$0) {
      super($$0);
   }

   @Override
   protected ddb a() {
      return b;
   }

   @Override
   public int b() {
      return 3;
   }

   @Override
   protected cml c() {
      return cgc.ur;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(cmm $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b);
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return e[this.g($$0)];
   }
}
