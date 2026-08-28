import java.util.Map;

public class clx extends bvx<clr> {
   public clx() {
      super(Map.of(cdi.o, cdj.a, cdi.m, cdj.b, cdi.aU, cdj.b, cdi.aV, cdj.b));
   }

   protected boolean a(arg $$0, clr $$1) {
      return $$1.aH() && !$$1.bi() && $$1.av() == bur.a;
   }

   protected void a(arg $$0, clr $$1, long $$2) {
      buf $$3 = $$1.dX().c(cdi.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dq());
         eye $$5 = null;
         if ($$4) {
            eye $$6 = cez.a($$1, 5, 5, $$3.dq());
            if ($$6 != null && clt.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dV().h() ? clt.a($$3, $$1.dV()) : a($$1, $$3);
         }

         $$1.dX().a(cdi.m, new cdl(je.a((jx)$$5), 0.6F, 1));
      }
   }

   private static eye a(clr $$0, buf $$1) {
      eye $$2 = $$1.dq().d($$0.dq());
      double $$3 = $$2.g() - azc.d($$0.dV().j(), 8.0, 4.0);
      eye $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dq().e($$4);
   }
}
