import com.google.common.collect.ImmutableMap;

public class bsb<E extends cem> extends boc<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bsb(int $$0) {
      super(ImmutableMap.of(bvn.aA, bvo.a, bvn.o, bvo.b, bvn.m, bvo.b, bvn.n, bvo.c, bvn.B, bvo.c, bvn.ay, bvo.c, bvn.aF, bvo.c), $$0);
   }

   protected boolean a(and $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(and $$0, E $$1, long $$2) {
      $$1.a(ars.AK, 5.0F, 1.0F);
   }

   protected void c(and $$0, E $$1, long $$2) {
      if ($$1.c(bmx.m)) {
         $$1.b(bmx.a);
      }

      $$1.dO().b(bvn.aA);
      $$1.dO().c(bvn.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dO().a(bvn.ay)) {
            cen.a($$1, $$1x.dm());
         }
      });
   }
}
