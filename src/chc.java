import java.util.Map;

public class chc extends brh<cgw> {
   public chc() {
      super(Map.of(bys.o, byt.a, bys.m, byt.b, bys.aU, byt.b, bys.aV, byt.b));
   }

   protected boolean a(apf $$0, cgw $$1) {
      return $$1.aC() && !$$1.bc() && $$1.ap() == bqa.a;
   }

   protected void a(apf $$0, cgw $$1, long $$2) {
      bpp $$3 = $$1.dP().c(bys.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         ept $$5 = null;
         if ($$4) {
            ept $$6 = caj.a($$1, 5, 5, $$3.dk());
            if ($$6 != null && cgy.a($$1, $$6) && $$3.i($$6.c, $$6.d, $$6.e) > $$3.g($$1)) {
               $$5 = $$6;
            }
         }

         if ($$5 == null) {
            $$5 = $$1.ei().h() ? cgy.a($$3, $$1.ei()) : a($$1, $$3);
         }

         $$1.dP().a(bys.m, new byv(ib.a($$5), 0.6F, 1));
      }
   }

   private static ept a(cgw $$0, bpp $$1) {
      ept $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - aww.d($$0.ei().j(), 8.0, 4.0);
      ept $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
