import java.util.Map;

public class cke extends buh<cjy> {
   public cke() {
      super(Map.of(cbs.o, cbt.a, cbs.m, cbt.b, cbs.aU, cbt.b, cbs.aV, cbt.b));
   }

   protected boolean a(aqm $$0, cjy $$1) {
      return $$1.aE() && !$$1.be() && $$1.ar() == bta.a;
   }

   protected void a(aqm $$0, cjy $$1, long $$2) {
      bso $$3 = $$1.dS().c(cbs.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dn());
         euk $$5 = null;
         if ($$4) {
            euk $$6 = cdj.a($$1, 5, 5, $$3.dn());
            if ($$6 != null && cka.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.el().h() ? cka.a($$3, $$1.el()) : a($$1, $$3);
         }

         $$1.dS().a(cbs.m, new cbv(io.a($$5), 0.6F, 1));
      }
   }

   private static euk a(cjy $$0, bso $$1) {
      euk $$2 = $$1.dn().d($$0.dn());
      double $$3 = $$2.f() - ayd.d($$0.el().j(), 8.0, 4.0);
      euk $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dn().e($$4);
   }
}
