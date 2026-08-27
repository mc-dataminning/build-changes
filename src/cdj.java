import java.util.Map;

public class cdj extends bnw<cdf> {
   public cdj() {
      super(Map.of(bvh.o, bvi.a, bvh.m, bvi.b, bvh.aT, bvi.b, bvh.aU, bvi.b));
   }

   protected boolean a(amz $$0, cdf $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bmr.a;
   }

   protected void a(amz $$0, cdf $$1, long $$2) {
      bmf $$3 = $$1.dO().c(bvh.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         boolean $$5 = $$1.k($$3.dk());
         boolean $$6 = $$1.l($$3.dk());
         elm $$7 = null;
         if ($$4) {
            $$7 = a($$1, $$3);
         } else if ($$6) {
            elm $$8 = bwx.a($$1, 5, 5, $$3.dk());
            if ($$8 != null && $$3.i($$8.c, $$8.d, $$8.e) > $$3.f($$1)) {
               $$7 = $$8;
            }
         } else if ($$5) {
            $$7 = bxa.a($$1, 5, 3);
         }

         if ($$7 != null) {
            $$1.dO().a(bvh.m, new bvk(hx.a($$7), 0.6F, 1));
         }
      }
   }

   protected void b(amz $$0, cdf $$1, long $$2) {
      $$1.dO().a(bvh.aT, avm.a, 20L);
   }

   private static elm a(cdf $$0, bmf $$1) {
      elm $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - aui.d($$0.eg().j(), 8.0, 4.0);
      elm $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
