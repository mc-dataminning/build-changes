import com.google.common.collect.ImmutableMap;

public class cbv extends bxz<cpa> {
   private static final int c = 25;
   private static final int d = 20;

   public cbv() {
      super(ImmutableMap.of(cfk.ay, cfl.a, cfk.o, cfl.b, cfk.aF, cfl.c, cfk.aD, cfl.c), cpb.b);
   }

   protected void a(ash $$0, cpa $$1, long $$2) {
      bxi<cpa> $$3 = $$1.ec();
      $$3.a(cfk.aD, bbk.a, 25L);
      $$3.b(cfk.m);
      bwg $$4 = $$1.ec().c(cfk.ay).get();
      byb.a($$1, $$4);
      $$1.b(bws.l);
      $$1.a($$4, 20, false);
   }

   protected boolean b(ash $$0, cpa $$1, long $$2) {
      return true;
   }

   protected void c(ash $$0, cpa $$1, long $$2) {
      if (!$$1.ec().a(cfk.aD) && !$$1.ec().a(cfk.aF)) {
         $$1.ec().a(cfk.aF, bbk.a, (long)(cpb.b - 25));
         $$1.a(axf.Ct, 3.0F, 1.0F);
      }
   }

   protected void d(ash $$0, cpa $$1, long $$2) {
      if ($$1.c(bws.l)) {
         $$1.b(bws.a);
      }

      $$1.ec().c(cfk.ay).ifPresent($$1::j);
      $$1.ec().b(cfk.ay);
   }
}
