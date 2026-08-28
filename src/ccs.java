import com.google.common.collect.ImmutableMap;

public class ccs<E extends cqb> extends byt<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public ccs(int $$0) {
      super(ImmutableMap.of(cge.aC, cgf.a, cge.p, cgf.b, cge.n, cgf.b, cge.o, cgf.c, cge.C, cgf.c, cge.aA, cgf.c, cge.aH, cgf.c), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.a(awn.CW, 5.0F, 1.0F);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.c(bxo.m)) {
         $$1.b(bxo.a);
      }

      $$1.eb().b(cge.aC);
      $$1.eb().c(cge.C).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.eb().a(cge.aA)) {
            cqc.a($$1, $$1x.dv());
         }
      });
   }
}
