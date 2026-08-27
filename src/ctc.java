public class ctc extends cru {
   public static final int a = 5;
   private static final hc[] b = hc.values();

   public ctc(dfi.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
      if ($$3.a(5) == 0) {
         hc $$4 = b[$$3.a(b.length)];
         gw $$5 = $$2.a($$4);
         dfj $$6 = $$1.a_($$5);
         csv $$7 = null;
         if (g($$6)) {
            $$7 = csw.qy;
         } else if ($$6.a(csw.qy) && $$6.c(crv.b) == $$4) {
            $$7 = csw.qx;
         } else if ($$6.a(csw.qx) && $$6.c(crv.b) == $$4) {
            $$7 = csw.qw;
         } else if ($$6.a(csw.qw) && $$6.c(crv.b) == $$4) {
            $$7 = csw.qv;
         }

         if ($$7 != null) {
            dfj $$8 = $$7.n().a(crv.b, $$4).a(crv.a, Boolean.valueOf($$6.u().a() == ean.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dfj $$0) {
      return $$0.i() || $$0.a(csw.G) && $$0.u().e() == 8;
   }
}
