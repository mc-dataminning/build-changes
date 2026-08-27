public class cst extends crl {
   public static final int a = 5;
   private static final ha[] b = ha.values();

   public cst(dez.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$3.a(5) == 0) {
         ha $$4 = b[$$3.a(b.length)];
         gu $$5 = $$2.a($$4);
         dfa $$6 = $$1.a_($$5);
         csm $$7 = null;
         if (g($$6)) {
            $$7 = csn.qy;
         } else if ($$6.a(csn.qy) && $$6.c(crm.b) == $$4) {
            $$7 = csn.qx;
         } else if ($$6.a(csn.qx) && $$6.c(crm.b) == $$4) {
            $$7 = csn.qw;
         } else if ($$6.a(csn.qw) && $$6.c(crm.b) == $$4) {
            $$7 = csn.qv;
         }

         if ($$7 != null) {
            dfa $$8 = $$7.n().a(crm.b, $$4).a(crm.a, Boolean.valueOf($$6.u().a() == eae.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dfa $$0) {
      return $$0.i() || $$0.a(csn.G) && $$0.u().e() == 8;
   }
}
