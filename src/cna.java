import java.util.Map;

public class cna extends bxa<cmu> {
   public cna() {
      super(Map.of(cel.o, cem.a, cel.m, cem.b, cel.aU, cem.b, cel.aV, cem.b));
   }

   protected boolean a(arp $$0, cmu $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bvt.a;
   }

   protected void a(arp $$0, cmu $$1, long $$2) {
      bvh $$3 = $$1.eb().c(cel.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dt());
         ezy $$5 = null;
         if ($$4) {
            ezy $$6 = cgc.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cmw.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cmw.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cel.m, new ceo(jh.a((ka)$$5), 0.6F, 1));
      }
   }

   private static ezy a(cmu $$0, bvh $$1) {
      ezy $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - azm.d($$0.dY().j(), 8.0, 4.0);
      ezy $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}
