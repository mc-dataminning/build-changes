public class csr extends crj {
   public static final int a = 5;
   private static final hb[] b = hb.values();

   public csr(dex.d $$0) {
      super($$0);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$3.a(5) == 0) {
         hb $$4 = b[$$3.a(b.length)];
         gv $$5 = $$2.a($$4);
         dey $$6 = $$1.a_($$5);
         csk $$7 = null;
         if (g($$6)) {
            $$7 = csl.qy;
         } else if ($$6.a(csl.qy) && $$6.c(crk.b) == $$4) {
            $$7 = csl.qx;
         } else if ($$6.a(csl.qx) && $$6.c(crk.b) == $$4) {
            $$7 = csl.qw;
         } else if ($$6.a(csl.qw) && $$6.c(crk.b) == $$4) {
            $$7 = csl.qv;
         }

         if ($$7 != null) {
            dey $$8 = $$7.n().a(crk.b, $$4).a(crk.a, Boolean.valueOf($$6.u().a() == eac.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dey $$0) {
      return $$0.i() || $$0.a(csl.G) && $$0.u().e() == 8;
   }
}
