import com.google.common.collect.ImmutableMap;

public class cae<E extends cnb> extends bwf<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cae(int $$0) {
      super(ImmutableMap.of(cdq.aB, cdr.a, cdq.o, cdr.b, cdq.m, cdr.b, cdq.n, cdr.c, cdq.B, cdr.c, cdq.az, cdr.c, cdq.aG, cdr.c), $$0);
   }

   protected boolean a(arj $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arj $$0, E $$1, long $$2) {
      $$1.a(awg.Cb, 5.0F, 1.0F);
   }

   protected void c(arj $$0, E $$1, long $$2) {
      if ($$1.c(buz.m)) {
         $$1.b(buz.a);
      }

      $$1.dY().b(cdq.aB);
      $$1.dY().c(cdq.B).filter($$1::c).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.e($$1x);
         }

         if (!$$1.dY().a(cdq.az)) {
            cnc.a($$1, $$1x.ds());
         }
      });
   }
}
