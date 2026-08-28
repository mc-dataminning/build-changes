import com.google.common.collect.ImmutableMap;

public class ccu<E extends cqf> extends byv<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public ccu(int $$0) {
      super(ImmutableMap.of(cgg.aC, cgh.a, cgg.p, cgh.b, cgg.n, cgh.b, cgg.o, cgh.c, cgg.C, cgh.c, cgg.aA, cgh.c, cgg.aH, cgh.c), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.a(awn.CZ, 5.0F, 1.0F);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.c(bxq.m)) {
         $$1.b(bxq.a);
      }

      $$1.ec().b(cgg.aC);
      $$1.ec().c(cgg.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(cgg.aA)) {
            cqg.a($$1, $$1x.dv());
         }
      });
   }
}
