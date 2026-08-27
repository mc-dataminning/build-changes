import com.google.common.collect.ImmutableMap;

public class brl<E extends cdv> extends bnm<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public brl(int $$0) {
      super(ImmutableMap.of(bux.aA, buy.a, bux.o, buy.b, bux.m, buy.b, bux.n, buy.c, bux.B, buy.c, bux.ay, buy.c, bux.aF, buy.c), $$0);
   }

   protected boolean a(amp $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(amp $$0, E $$1, long $$2) {
      $$1.a(arc.AK, 5.0F, 1.0F);
   }

   protected void c(amp $$0, E $$1, long $$2) {
      if ($$1.c(bmh.m)) {
         $$1.b(bmh.a);
      }

      $$1.dO().b(bux.aA);
      $$1.dO().c(bux.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dO().a(bux.ay)) {
            cdw.a($$1, $$1x.dm());
         }
      });
   }
}
