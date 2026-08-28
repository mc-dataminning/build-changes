import java.util.Map;

public class cmf extends bwf<clz> {
   public cmf() {
      super(Map.of(cdq.o, cdr.a, cdq.m, cdr.b, cdq.aU, cdr.b, cdq.aV, cdr.b));
   }

   protected boolean a(arj $$0, clz $$1) {
      return $$1.aH() && !$$1.bi() && $$1.av() == buz.a;
   }

   protected void a(arj $$0, clz $$1, long $$2) {
      bun $$3 = $$1.dY().c(cdq.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dq());
         eyw $$5 = null;
         if ($$4) {
            eyw $$6 = cfh.a($$1, 5, 5, $$3.dq());
            if ($$6 != null && cmb.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dV().h() ? cmb.a($$3, $$1.dV()) : a($$1, $$3);
         }

         $$1.dY().a(cdq.m, new cdt(jf.a((jy)$$5), 0.6F, 1));
      }
   }

   private static eyw a(clz $$0, bun $$1) {
      eyw $$2 = $$1.dq().d($$0.dq());
      double $$3 = $$2.g() - azf.d($$0.dV().j(), 8.0, 4.0);
      eyw $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dq().e($$4);
   }
}
