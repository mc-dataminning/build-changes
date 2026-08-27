import java.util.Map;

public class cfp extends bpw<cfj> {
   public cfp() {
      super(Map.of(bxh.o, bxi.a, bxh.m, bxi.b, bxh.aU, bxi.b, bxh.aV, bxi.b));
   }

   protected boolean a(aov $$0, cfj $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bor.a;
   }

   protected void a(aov $$0, cfj $$1, long $$2) {
      bog $$3 = $$1.dO().c(bxh.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         ens $$5 = null;
         if ($$4) {
            ens $$6 = byy.a($$1, 5, 5, $$3.dk());
            if ($$6 != null && cfl.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.f($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.eh().h() ? cfl.a($$3, $$1.eh()) : a($$1, $$3);
         }

         $$1.dO().a(bxh.m, new bxk(hz.a($$5), 0.6F, 1));
      }
   }

   private static ens a(cfj $$0, bog $$1) {
      ens $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - awh.d($$0.eh().j(), 8.0, 4.0);
      ens $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
