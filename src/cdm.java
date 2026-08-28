import com.google.common.collect.ImmutableMap;

public class cdm<E extends crc> extends bzn<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cdm(int $$0) {
      super(ImmutableMap.of(cgy.aC, cgz.a, cgy.p, cgz.b, cgy.n, cgz.b, cgy.o, cgz.c, cgy.C, cgz.c, cgy.aA, cgz.c, cgy.aH, cgz.c), $$0);
   }

   protected boolean a(aru $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aru $$0, E $$1, long $$2) {
      $$1.a(awr.CZ, 5.0F, 1.0F);
   }

   protected void c(aru $$0, E $$1, long $$2) {
      if ($$1.c(byi.m)) {
         $$1.b(byi.a);
      }

      $$1.ec().b(cgy.aC);
      $$1.ec().c(cgy.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(cgy.aA)) {
            crd.a($$1, $$1x.dv());
         }
      });
   }
}
