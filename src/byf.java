import com.google.common.collect.ImmutableMap;

public class byf<E extends clc> extends bug<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public byf(int $$0) {
      super(ImmutableMap.of(cbr.aB, cbs.a, cbr.o, cbs.b, cbr.m, cbs.b, cbr.n, cbs.c, cbr.B, cbs.c, cbr.az, cbs.c, cbr.aG, cbs.c), $$0);
   }

   protected boolean a(aqt $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aqt $$0, E $$1, long $$2) {
      $$1.a(avo.Cp, 5.0F, 1.0F);
   }

   protected void c(aqt $$0, E $$1, long $$2) {
      if ($$1.c(bsz.m)) {
         $$1.b(bsz.a);
      }

      $$1.dZ().b(cbr.aB);
      $$1.dZ().c(cbr.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.dZ().a(cbr.az)) {
            cld.a($$1, $$1x.du());
         }
      });
   }
}
