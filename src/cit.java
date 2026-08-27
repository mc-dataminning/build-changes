import java.util.Map;

public class cit extends bsw<cin> {
   public cit() {
      super(Map.of(cah.o, cai.a, cah.m, cai.b, cah.aU, cai.b, cah.aV, cai.b));
   }

   protected boolean a(aqe $$0, cin $$1) {
      return $$1.aC() && !$$1.bc() && $$1.ap() == brp.a;
   }

   protected void a(aqe $$0, cin $$1, long $$2) {
      bre $$3 = $$1.dQ().c(cah.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dl());
         etf $$5 = null;
         if ($$4) {
            etf $$6 = cby.a($$1, 5, 5, $$3.dl());
            if ($$6 != null && cip.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ej().h() ? cip.a($$3, $$1.ej()) : a($$1, $$3);
         }

         $$1.dQ().a(cah.m, new cak(im.a($$5), 0.6F, 1));
      }
   }

   private static etf a(cin $$0, bre $$1) {
      etf $$2 = $$1.dl().d($$0.dl());
      double $$3 = $$2.f() - axw.d($$0.ej().j(), 8.0, 4.0);
      etf $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dl().e($$4);
   }
}
