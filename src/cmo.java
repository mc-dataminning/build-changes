import java.util.Map;

public class cmo extends bwo<cmi> {
   public cmo() {
      super(Map.of(cdz.o, cea.a, cdz.m, cea.b, cdz.aU, cea.b, cdz.aV, cea.b));
   }

   protected boolean a(arm $$0, cmi $$1) {
      return $$1.aJ() && !$$1.bk() && $$1.ax() == bvh.a;
   }

   protected void a(arm $$0, cmi $$1, long $$2) {
      buv $$3 = $$1.ed().c(cdz.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dv());
         ezh $$5 = null;
         if ($$4) {
            ezh $$6 = cfq.a($$1, 5, 5, $$3.dv());
            if ($$6 != null && cmk.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ea().h() ? cmk.a($$3, $$1.ea()) : a($$1, $$3);
         }

         $$1.ed().a(cdz.m, new cec(jg.a((jz)$$5), 0.6F, 1));
      }
   }

   private static ezh a(cmi $$0, buv $$1) {
      ezh $$2 = $$1.dv().d($$0.dv());
      double $$3 = $$2.g() - azj.d($$0.ea().j(), 8.0, 4.0);
      ezh $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dv().e($$4);
   }
}
