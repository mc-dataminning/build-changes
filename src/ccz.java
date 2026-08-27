import java.util.Map;

public class ccz extends bnm<ccv> {
   public ccz() {
      super(Map.of(bux.o, buy.a, bux.m, buy.b, bux.aT, buy.b, bux.aU, buy.b));
   }

   protected boolean a(amp $$0, ccv $$1) {
      return $$1.aC() && !$$1.aZ() && $$1.ap() == bmh.a;
   }

   protected void a(amp $$0, ccv $$1, long $$2) {
      blv $$3 = $$1.dO().c(bux.o).orElse(null);
      if ($$3 != null) {
         boolean $$4 = $$1.j($$3.dk());
         boolean $$5 = $$1.k($$3.dk());
         boolean $$6 = $$1.l($$3.dk());
         elb $$7 = null;
         if ($$4) {
            $$7 = a($$1, $$3);
         } else if ($$6) {
            elb $$8 = bwn.a($$1, 5, 5, $$3.dk());
            if ($$8 != null && $$3.i($$8.c, $$8.d, $$8.e) > $$3.f($$1)) {
               $$7 = $$8;
            }
         } else if ($$5) {
            $$7 = bwq.a($$1, 5, 3);
         }

         if ($$7 != null) {
            $$1.dO().a(bux.m, new bva(hv.a($$7), 0.6F, 1));
         }
      }
   }

   protected void b(amp $$0, ccv $$1, long $$2) {
      $$1.dO().a(bux.aT, avc.a, 20L);
   }

   private static elb a(ccv $$0, blv $$1) {
      elb $$2 = $$1.dk().d($$0.dk());
      double $$3 = $$2.f() - aty.d($$0.eg().j(), 8.0, 4.0);
      elb $$4 = $$2.d().d($$3, $$3, $$3);
      return $$0.dk().e($$4);
   }
}
