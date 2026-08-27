public class cte extends crw {
   public static final int a = 5;
   private static final hc[] b = hc.values();

   public cte(dfk.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$3.a(5) == 0) {
         hc $$4 = b[$$3.a(b.length)];
         gw $$5 = $$2.a($$4);
         dfl $$6 = $$1.a_($$5);
         csx $$7 = null;
         if (g($$6)) {
            $$7 = csy.qy;
         } else if ($$6.a(csy.qy) && $$6.c(crx.b) == $$4) {
            $$7 = csy.qx;
         } else if ($$6.a(csy.qx) && $$6.c(crx.b) == $$4) {
            $$7 = csy.qw;
         } else if ($$6.a(csy.qw) && $$6.c(crx.b) == $$4) {
            $$7 = csy.qv;
         }

         if ($$7 != null) {
            dfl $$8 = $$7.n().a(crx.b, $$4).a(crx.a, Boolean.valueOf($$6.u().a() == eap.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dfl $$0) {
      return $$0.i() || $$0.a(csy.G) && $$0.u().e() == 8;
   }
}
