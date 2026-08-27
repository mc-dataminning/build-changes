public class cpu extends col {
   public static final int a = 5;
   private static final ha[] b = ha.values();

   public cpu(dca.d $$0) {
      super($$0);
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$3.a(5) == 0) {
         ha $$4 = b[$$3.a(b.length)];
         gu $$5 = $$2.a($$4);
         dcb $$6 = $$1.a_($$5);
         cpn $$7 = null;
         if (g($$6)) {
            $$7 = cpo.qy;
         } else if ($$6.a(cpo.qy) && $$6.c(com.b) == $$4) {
            $$7 = cpo.qx;
         } else if ($$6.a(cpo.qx) && $$6.c(com.b) == $$4) {
            $$7 = cpo.qw;
         } else if ($$6.a(cpo.qw) && $$6.c(com.b) == $$4) {
            $$7 = cpo.qv;
         }

         if ($$7 != null) {
            dcb $$8 = $$7.n().a(com.b, $$4).a(com.a, Boolean.valueOf($$6.u().a() == dxf.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dcb $$0) {
      return $$0.i() || $$0.a(cpo.G) && $$0.u().e() == 8;
   }
}
