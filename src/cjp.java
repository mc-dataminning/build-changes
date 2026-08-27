import java.util.Map;

public class cjp extends bts<cjj> {
   public cjp() {
      super(Map.of(cbd.o, cbe.a, cbd.m, cbe.b, cbd.aU, cbe.b, cbd.aV, cbe.b));
   }

   protected boolean a(aqh $$0, cjj $$1) {
      return $$1.aC() && !$$1.bc() && $$1.ap() == bsl.a;
   }

   protected void a(aqh $$0, cjj $$1, long $$2) {
      bsa $$3 = $$1.dQ().c(cbd.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dl());
         etp $$5 = null;
         if ($$4) {
            etp $$6 = ccu.a($$1, 5, 5, $$3.dl());
            if ($$6 != null && cjl.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ej().h() ? cjl.a($$3, $$1.ej()) : a($$1, $$3);
         }

         $$1.dQ().a(cbd.m, new cbg(in.a($$5), 0.6F, 1));
      }
   }

   private static etp a(cjj $$0, bsa $$1) {
      etp $$2 = $$1.dl().d($$0.dl());
      double $$3 = $$2.f() - axz.d($$0.ej().j(), 8.0, 4.0);
      etp $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dl().e($$4);
   }
}
