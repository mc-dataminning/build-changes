import com.google.common.collect.ImmutableMap;

public class bon<E extends caq> extends bkp<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bon(int $$0) {
      super(ImmutableMap.of(brz.aA, bsa.a, brz.o, bsa.b, brz.m, bsa.b, brz.n, bsa.c, brz.B, bsa.c, brz.ay, bsa.c, brz.aF, bsa.c), $$0);
   }

   protected boolean a(akk $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(akk $$0, E $$1, long $$2) {
      $$1.a(aow.zK, 5.0F, 1.0F);
   }

   protected void c(akk $$0, E $$1, long $$2) {
      if ($$1.c(bjk.m)) {
         $$1.b(bjk.a);
      }

      $$1.dM().b(brz.aA);
      $$1.dM().c(brz.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dM().a(brz.ay)) {
            car.a($$1, $$1x.dk());
         }
      });
   }
}
