import java.util.Map;

public class cha extends brg<cgu> {
   public cha() {
      super(Map.of(byr.o, bys.a, byr.m, bys.b, byr.aU, bys.b, byr.aV, bys.b));
   }

   protected boolean a(apf $$0, cgu $$1) {
      return $$1.aC() && !$$1.bc() && $$1.ap() == bpz.a;
   }

   protected void a(apf $$0, cgu $$1, long $$2) {
      bpo $$3 = $$1.dP().c(byr.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         epr $$5 = null;
         if ($$4) {
            epr $$6 = cai.a($$1, 5, 5, $$3.dk());
            if ($$6 != null && cgw.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ei().h() ? cgw.a($$3, $$1.ei()) : a($$1, $$3);
         }

         $$1.dP().a(byr.m, new byu(ib.a($$5), 0.6F, 1));
      }
   }

   private static epr a(cgu $$0, bpo $$1) {
      epr $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - aww.d($$0.ei().j(), 8.0, 4.0);
      epr $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
