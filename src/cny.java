import java.util.Map;

public class cny extends bxy<cns> {
   public cny() {
      super(Map.of(cfj.o, cfk.a, cfj.m, cfk.b, cfj.aU, cfk.b, cfj.aV, cfk.b));
   }

   protected boolean a(ash $$0, cns $$1) {
      return $$1.aJ() && !$$1.bj() && $$1.aw() == bwr.a;
   }

   protected void a(ash $$0, cns $$1, long $$2) {
      bwf $$3 = $$1.eb().c(cfj.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.k($$3.dt());
         fbx $$5 = null;
         if ($$4) {
            fbx $$6 = cha.a($$1, 5, 5, $$3.dt());
            if ($$6 != null && cnu.a($$1, $$6) && $$3.i($$6.d, $$6.e, $$6.f) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.dY().h() ? cnu.a($$3, $$1.dY()) : a($$1, $$3);
         }

         $$1.eb().a(cfj.m, new cfm(jh.a((ka)$$5), 0.6F, 1));
      }
   }

   private static fbx a(cns $$0, bwf $$1) {
      fbx $$2 = $$1.dt().d($$0.dt());
      double $$3 = $$2.g() - bae.d($$0.dY().j(), 8.0, 4.0);
      fbx $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dt().e($$4);
   }
}
