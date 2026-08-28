import com.google.common.collect.ImmutableMap;

public class byt<E extends clo> extends buu<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public byt(int $$0) {
      super(ImmutableMap.of(ccf.aB, ccg.a, ccf.o, ccg.b, ccf.m, ccg.b, ccf.n, ccg.c, ccf.B, ccg.c, ccf.az, ccg.c, ccf.aG, ccg.c), $$0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      $$1.a(avh.BU, 5.0F, 1.0F);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.c(btn.m)) {
         $$1.b(btn.a);
      }

      $$1.dU().b(ccf.aB);
      $$1.dU().c(ccf.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dU().a(ccf.az)) {
            clp.a($$1, $$1x.dq());
         }
      });
   }
}
