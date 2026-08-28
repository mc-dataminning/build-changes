import com.google.common.collect.ImmutableMap;

public class ccz<E extends cqp> extends bza<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public ccz(int $$0) {
      super(ImmutableMap.of(cgl.aC, cgm.a, cgl.p, cgm.b, cgl.n, cgm.b, cgl.o, cgm.c, cgl.C, cgm.c, cgl.aA, cgm.c, cgl.aH, cgm.c), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.a(awn.CZ, 5.0F, 1.0F);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.c(bxv.m)) {
         $$1.b(bxv.a);
      }

      $$1.eb().b(cgl.aC);
      $$1.eb().c(cgl.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cgl.aA)) {
            cqq.a($$1, $$1x.du());
         }
      });
   }
}
