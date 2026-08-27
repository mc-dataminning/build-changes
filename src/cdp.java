import java.util.Map;

public class cdp extends bob<cdk> {
   public cdp() {
      super(Map.of(bvm.o, bvn.a, bvm.m, bvn.b, bvm.aT, bvn.b, bvm.aU, bvn.b));
   }

   protected boolean a(and $$0, cdk $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bmw.a;
   }

   protected void a(and $$0, cdk $$1, long $$2) {
      bmk $$3 = $$1.dO().c(bvm.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         boolean $$5 = $$1.k($$3.dk());
         boolean $$6 = $$1.l($$3.dk());
         els $$7 = null;
         if ($$4) {
            $$7 = a($$1, $$3);
         } else if ($$6) {
            els $$8 = bxc.a($$1, 5, 5, $$3.dk());
            if ($$8 != null && $$3.i($$8.c, $$8.d, $$8.e) > $$3.f($$1)) {
               $$7 = $$8;
            }
         } else if ($$5) {
            $$7 = bxf.a($$1, 5, 3);
         }

         if ($$7 != null) {
            $$1.dO().a(bvm.m, new bvp(hx.a($$7), 0.6F, 1));
         }
      }
   }

   protected void b(and $$0, cdk $$1, long $$2) {
      $$1.dO().a(bvm.aT, avr.a, 20L);
   }

   private static els a(cdk $$0, bmk $$1) {
      els $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - aun.d($$0.eg().j(), 8.0, 4.0);
      els $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
