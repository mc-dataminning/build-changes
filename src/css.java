public class css extends crk {
   public static final int a = 5;
   private static final ha[] b = ha.values();

   public css(dey.d $$0) {
      super($$0);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$3.a(5) == 0) {
         ha $$4 = b[$$3.a(b.length)];
         gu $$5 = $$2.a($$4);
         dez $$6 = $$1.a_($$5);
         csl $$7 = null;
         if (g($$6)) {
            $$7 = csm.qy;
         } else if ($$6.a(csm.qy) && $$6.c(crl.b) == $$4) {
            $$7 = csm.qx;
         } else if ($$6.a(csm.qx) && $$6.c(crl.b) == $$4) {
            $$7 = csm.qw;
         } else if ($$6.a(csm.qw) && $$6.c(crl.b) == $$4) {
            $$7 = csm.qv;
         }

         if ($$7 != null) {
            dez $$8 = $$7.n().a(crl.b, $$4).a(crl.a, Boolean.valueOf($$6.u().a() == ead.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dez $$0) {
      return $$0.i() || $$0.a(csm.G) && $$0.u().e() == 8;
   }
}
