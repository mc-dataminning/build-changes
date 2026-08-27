public class cus extends cpv {
   public static final int a = 3;
   public static final ddb b = dcr.as;
   private static final efb[] c = new efb[]{
      cpn.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      cpn.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected cus(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return c[$$0.c(b)];
   }

   @Override
   protected boolean d(dcb $$0, cls $$1, gu $$2) {
      return $$0.a(cpo.dX);
   }

   @Override
   public boolean e_(dcb $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz(cgc.ru);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(b);
   }
}
