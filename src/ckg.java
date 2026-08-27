import java.util.Map;

public class ckg extends bug<cka> {
   public ckg() {
      super(Map.of(cbr.o, cbs.a, cbr.m, cbs.b, cbr.aU, cbs.b, cbr.aV, cbs.b));
   }

   protected boolean a(aqt $$0, cka $$1) {
      return $$1.aE() && !$$1.bi() && $$1.ar() == bsz.a;
   }

   protected void a(aqt $$0, cka $$1, long $$2) {
      bso $$3 = $$1.dZ().c(cbr.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.ds());
         ewu $$5 = null;
         if ($$4) {
            ewu $$6 = cdi.a($$1, 5, 5, $$3.ds());
            if ($$6 != null && ckc.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.et().h() ? ckc.a($$3, $$1.et()) : a($$1, $$3);
         }

         $$1.dZ().a(cbr.m, new cbu(ir.a($$5), 0.6F, 1));
      }
   }

   private static ewu a(cka $$0, bso $$1) {
      ewu $$2 = $$1.ds().d($$0.ds());
      double $$3 = $$2.f() - aym.d($$0.et().j(), 8.0, 4.0);
      ewu $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.ds().e($$4);
   }
}
