import com.google.common.collect.ImmutableMap;

public class byg<E extends cla> extends buh<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public byg(int $$0) {
      super(ImmutableMap.of(cbs.aB, cbt.a, cbs.o, cbt.b, cbs.m, cbt.b, cbs.n, cbt.c, cbs.B, cbt.c, cbs.az, cbt.c, cbs.aG, cbt.c), $$0);
   }

   protected boolean a(aqm $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqm $$0, E $$1, long $$2) {
      $$1.a(avh.BR, 5.0F, 1.0F);
   }

   protected void c(aqm $$0, E $$1, long $$2) {
      if ($$1.c(bta.m)) {
         $$1.b(bta.a);
      }

      $$1.dS().b(cbs.aB);
      $$1.dS().c(cbs.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dS().a(cbs.az)) {
            clb.a($$1, $$1x.dp());
         }
      });
   }
}
