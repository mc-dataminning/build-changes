import java.util.Map;

public class cna extends bxa<cmu> {
   public cna() {
      super(Map.of(cel.o, cem.a, cel.m, cem.b, cel.aU, cem.b, cel.aV, cem.b));
   }

   protected boolean a(ard $$0, cmu $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bvt.a;
   }

   protected void a(ard $$0, cmu $$1, long $$2) {
      bvh $$3 = $$1.eb().c(cel.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.l($$3.dt());
         fba $$5 = null;
         if ($$4) {
            fba $$6 = cgc.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cmw.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cmw.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cel.m, new ceo(ji.a((kb)$$5), 0.6F, 1));
      }
   }

   private static fba a(cmu $$0, bvh $$1) {
      fba $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - ayz.d($$0.dY().j(), 8.0, 4.0);
      fba $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}
