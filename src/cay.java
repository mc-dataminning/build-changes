import com.google.common.collect.ImmutableMap;

public class cay<E extends cnz> extends bwz<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cay(int $$0) {
      super(ImmutableMap.of(cek.aB, cel.a, cek.o, cel.b, cek.m, cel.b, cek.n, cel.c, cek.B, cel.c, cek.az, cel.c, cek.aG, cel.c), $$0);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arc $$0, E $$1, long $$2) {
      $$1.a(awa.CK, 5.0F, 1.0F);
   }

   protected void c(arc $$0, E $$1, long $$2) {
      if ($$1.c(bvs.m)) {
         $$1.b(bvs.a);
      }

      $$1.ec().b(cek.aB);
      $$1.ec().c(cek.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(cek.az)) {
            coa.a($$1, $$1x.dw());
         }
      });
   }
}
