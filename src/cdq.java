import java.util.Map;

public class cdq extends boc<cdl> {
   public cdq() {
      super(Map.of(bvn.o, bvo.a, bvn.m, bvo.b, bvn.aT, bvo.b, bvn.aU, bvo.b));
   }

   protected boolean a(and $$0, cdl $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bmx.a;
   }

   protected void a(and $$0, cdl $$1, long $$2) {
      bml $$3 = $$1.dO().c(bvn.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         boolean $$5 = $$1.k($$3.dk());
         boolean $$6 = $$1.l($$3.dk());
         elt $$7 = null;
         if ($$4) {
            $$7 = a($$1, $$3);
         } else if ($$6) {
            elt $$8 = bxd.a($$1, 5, 5, $$3.dk());
            if ($$8 != null && $$3.i($$8.c, $$8.d, $$8.e) > $$3.f($$1)) {
               $$7 = $$8;
            }
         } else if ($$5) {
            $$7 = bxg.a($$1, 5, 3);
         }

         if ($$7 != null) {
            $$1.dO().a(bvn.m, new bvq(hx.a($$7), 0.6F, 1));
         }
      }
   }

   protected void b(and $$0, cdl $$1, long $$2) {
      $$1.dO().a(bvn.aT, avs.a, 20L);
   }

   private static elt a(cdl $$0, bml $$1) {
      elt $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - auo.d($$0.eg().j(), 8.0, 4.0);
      elt $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
