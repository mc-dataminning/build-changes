import com.google.common.collect.ImmutableMap;

public class caw<E extends cnt> extends bwx<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public caw(int $$0) {
      super(ImmutableMap.of(cei.aB, cej.a, cei.o, cej.b, cei.m, cej.b, cei.n, cej.c, cei.B, cej.c, cei.az, cej.c, cei.aG, cej.c), $$0);
   }

   protected boolean a(arq $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arq $$0, E $$1, long $$2) {
      $$1.a(awo.BZ, 5.0F, 1.0F);
   }

   protected void c(arq $$0, E $$1, long $$2) {
      if ($$1.c(bvq.m)) {
         $$1.b(bvq.a);
      }

      $$1.ee().b(cei.aB);
      $$1.ee().c(cei.B).filter($$1::c).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.e($$1x);
         }

         if (!$$1.ee().a(cei.az)) {
            cnu.a($$1, $$1x.dy());
         }
      });
   }
}
