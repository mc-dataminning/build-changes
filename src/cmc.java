import java.util.Map;

public class cmc extends bwc<clw> {
   public cmc() {
      super(Map.of(cdn.o, cdo.a, cdn.m, cdo.b, cdn.aU, cdo.b, cdn.aV, cdo.b));
   }

   protected boolean a(arh $$0, clw $$1) {
      return $$1.aH() && !$$1.bi() && $$1.av() == buw.a;
   }

   protected void a(arh $$0, clw $$1, long $$2) {
      buk $$3 = $$1.dX().c(cdn.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dq());
         eys $$5 = null;
         if ($$4) {
            eys $$6 = cfe.a($$1, 5, 5, $$3.dq());
            if ($$6 != null && cly.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dV().h() ? cly.a($$3, $$1.dV()) : a($$1, $$3);
         }

         $$1.dX().a(cdn.m, new cdq(je.a((jx)$$5), 0.6F, 1));
      }
   }

   private static eys a(clw $$0, buk $$1) {
      eys $$2 = $$1.dq().d($$0.dq());
      double $$3 = $$2.g() - azd.d($$0.dV().j(), 8.0, 4.0);
      eys $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dq().e($$4);
   }
}
