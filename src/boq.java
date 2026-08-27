import com.google.common.collect.ImmutableMap;

public class boq<E extends cat> extends bks<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public boq(int $$0) {
      super(ImmutableMap.of(bsc.aA, bsd.a, bsc.o, bsd.b, bsc.m, bsd.b, bsc.n, bsd.c, bsc.B, bsd.c, bsc.ay, bsd.c, bsc.aF, bsd.c), $$0);
   }

   protected boolean a(akn $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(akn $$0, E $$1, long $$2) {
      $$1.a(aoz.zK, 5.0F, 1.0F);
   }

   protected void c(akn $$0, E $$1, long $$2) {
      if ($$1.c(bjn.m)) {
         $$1.b(bjn.a);
      }

      $$1.dM().b(bsc.aA);
      $$1.dM().c(bsc.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dM().a(bsc.ay)) {
            cau.a($$1, $$1x.dk());
         }
      });
   }
}
