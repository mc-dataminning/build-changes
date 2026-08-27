import com.google.common.collect.ImmutableMap;

public class bra<E extends cdd> extends bnc<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bra(int $$0) {
      super(ImmutableMap.of(bum.aA, bun.a, bum.o, bun.b, bum.m, bun.b, bum.n, bun.c, bum.B, bun.c, bum.ay, bun.c, bum.aF, bun.c), $$0);
   }

   protected boolean a(ami $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ami $$0, E $$1, long $$2) {
      $$1.a(aqv.Ap, 5.0F, 1.0F);
   }

   protected void c(ami $$0, E $$1, long $$2) {
      if ($$1.c(blx.m)) {
         $$1.b(blx.a);
      }

      $$1.dP().b(bum.aA);
      $$1.dP().c(bum.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dP().a(bum.ay)) {
            cde.a($$1, $$1x.dn());
         }
      });
   }
}
