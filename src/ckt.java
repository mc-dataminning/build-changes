import java.util.Map;

public class ckt extends buv<ckn> {
   public ckt() {
      super(Map.of(ccg.o, cch.a, ccg.m, cch.b, ccg.aU, cch.b, ccg.aV, cch.b));
   }

   protected boolean a(aqm $$0, ckn $$1) {
      return $$1.aG() && !$$1.bg() && $$1.at() == bto.a;
   }

   protected void a(aqm $$0, ckn $$1, long $$2) {
      btc $$3 = $$1.dV().c(ccg.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.b($$3.dp());
         ewh $$5 = null;
         if ($$4) {
            ewh $$6 = cdx.a($$1, 5, 5, $$3.dp());
            if ($$6 != null && ckp.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dU().h() ? ckp.a($$3, $$1.dU()) : a($$1, $$3);
         }

         $$1.dV().a(ccg.m, new ccj(ja.a($$5), 0.6F, 1));
      }
   }

   private static ewh a(ckn $$0, btc $$1) {
      ewh $$2 = $$1.dp().d($$0.dp());
      double $$3 = $$2.f() - ayg.d($$0.dU().j(), 8.0, 4.0);
      ewh $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dp().e($$4);
   }
}
