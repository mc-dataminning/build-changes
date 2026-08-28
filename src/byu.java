import com.google.common.collect.ImmutableMap;

public class byu<E extends clp> extends buv<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public byu(int $$0) {
      super(ImmutableMap.of(ccg.aB, cch.a, ccg.o, cch.b, ccg.m, cch.b, ccg.n, cch.c, ccg.B, cch.c, ccg.az, cch.c, ccg.aG, cch.c), $$0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      $$1.a(avh.BU, 5.0F, 1.0F);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.c(bto.m)) {
         $$1.b(bto.a);
      }

      $$1.dV().b(ccg.aB);
      $$1.dV().c(ccg.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dV().a(ccg.az)) {
            clq.a($$1, $$1x.dr());
         }
      });
   }
}
