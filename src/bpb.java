import com.google.common.collect.ImmutableMap;

public class bpb<E extends cbe> extends bld<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bpb(int $$0) {
      super(ImmutableMap.of(bsn.aA, bso.a, bsn.o, bso.b, bsn.m, bso.b, bsn.n, bso.c, bsn.B, bso.c, bsn.ay, bso.c, bsn.aF, bso.c), $$0);
   }

   protected boolean a(akt $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(akt $$0, E $$1, long $$2) {
      $$1.a(apg.zK, 5.0F, 1.0F);
   }

   protected void c(akt $$0, E $$1, long $$2) {
      if ($$1.c(bjy.m)) {
         $$1.b(bjy.a);
      }

      $$1.dN().b(bsn.aA);
      $$1.dN().c(bsn.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dN().a(bsn.ay)) {
            cbf.a($$1, $$1x.dl());
         }
      });
   }
}
