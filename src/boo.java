import com.google.common.collect.ImmutableMap;

public class boo<E extends car> extends bkq<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public boo(int $$0) {
      super(ImmutableMap.of(bsa.aA, bsb.a, bsa.o, bsb.b, bsa.m, bsb.b, bsa.n, bsb.c, bsa.B, bsb.c, bsa.ay, bsb.c, bsa.aF, bsb.c), $$0);
   }

   protected boolean a(akk $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(akk $$0, E $$1, long $$2) {
      $$1.a(aow.zF, 5.0F, 1.0F);
   }

   protected void c(akk $$0, E $$1, long $$2) {
      if ($$1.c(bjk.m)) {
         $$1.b(bjk.a);
      }

      $$1.dM().b(bsa.aA);
      $$1.dM().c(bsa.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dM().a(bsa.ay)) {
            cas.a($$1, $$1x.dk());
         }
      });
   }
}
