import com.google.common.collect.ImmutableMap;

public class cby<E extends cpa> extends bxz<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cby(int $$0) {
      super(ImmutableMap.of(cfk.aB, cfl.a, cfk.o, cfl.b, cfk.m, cfl.b, cfk.n, cfl.c, cfk.B, cfl.c, cfk.az, cfl.c, cfk.aG, cfl.c), $$0);
   }

   protected boolean a(ash $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ash $$0, E $$1, long $$2) {
      $$1.a(axf.Cu, 5.0F, 1.0F);
   }

   protected void c(ash $$0, E $$1, long $$2) {
      if ($$1.c(bws.m)) {
         $$1.b(bws.a);
      }

      $$1.ec().b(cfk.aB);
      $$1.ec().c(cfk.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(cfk.az)) {
            cpb.a($$1, $$1x.dw());
         }
      });
   }
}
