public class csx extends crp {
   public static final int a = 5;
   private static final hc[] b = hc.values();

   public csx(dfd.d $$0) {
      super($$0);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$3.a(5) == 0) {
         hc $$4 = b[$$3.a(b.length)];
         gw $$5 = $$2.a($$4);
         dfe $$6 = $$1.a_($$5);
         csq $$7 = null;
         if (g($$6)) {
            $$7 = csr.qy;
         } else if ($$6.a(csr.qy) && $$6.c(crq.b) == $$4) {
            $$7 = csr.qx;
         } else if ($$6.a(csr.qx) && $$6.c(crq.b) == $$4) {
            $$7 = csr.qw;
         } else if ($$6.a(csr.qw) && $$6.c(crq.b) == $$4) {
            $$7 = csr.qv;
         }

         if ($$7 != null) {
            dfe $$8 = $$7.n().a(crq.b, $$4).a(crq.a, Boolean.valueOf($$6.u().a() == eai.c));
            $$1.b($$5, $$8);
         }
      }
   }

   public static boolean g(dfe $$0) {
      return $$0.i() || $$0.a(csr.G) && $$0.u().e() == 8;
   }
}
