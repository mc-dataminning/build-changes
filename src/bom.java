import com.google.common.collect.ImmutableMap;

public class bom<E extends cap> extends bko<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bom(int $$0) {
      super(ImmutableMap.of(bry.aA, brz.a, bry.o, brz.b, bry.m, brz.b, bry.n, brz.c, bry.B, brz.c, bry.ay, brz.c, bry.aF, brz.c), $$0);
   }

   protected boolean a(aki $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aki $$0, E $$1, long $$2) {
      $$1.a(aou.zF, 5.0F, 1.0F);
   }

   protected void c(aki $$0, E $$1, long $$2) {
      if ($$1.c(bji.m)) {
         $$1.b(bji.a);
      }

      $$1.dM().b(bry.aA);
      $$1.dM().c(bry.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dM().a(bry.ay)) {
            caq.a($$1, $$1x.dk());
         }
      });
   }
}
