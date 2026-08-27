import com.google.common.collect.ImmutableMap;

public class bov<E extends cay> extends bkx<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bov(int $$0) {
      super(ImmutableMap.of(bsh.aA, bsi.a, bsh.o, bsi.b, bsh.m, bsi.b, bsh.n, bsi.c, bsh.B, bsi.c, bsh.ay, bsi.c, bsh.aF, bsi.c), $$0);
   }

   protected boolean a(akq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(akq $$0, E $$1, long $$2) {
      $$1.a(apd.zK, 5.0F, 1.0F);
   }

   protected void c(akq $$0, E $$1, long $$2) {
      if ($$1.c(bjs.m)) {
         $$1.b(bjs.a);
      }

      $$1.dN().b(bsh.aA);
      $$1.dN().c(bsh.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dN().a(bsh.ay)) {
            caz.a($$1, $$1x.dl());
         }
      });
   }
}
