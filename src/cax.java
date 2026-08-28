import com.google.common.collect.ImmutableMap;

public class cax<E extends cnx> extends bwy<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public cax(int $$0) {
      super(ImmutableMap.of(cej.aB, cek.a, cej.o, cek.b, cej.m, cek.b, cej.n, cek.c, cej.B, cek.c, cej.az, cek.c, cej.aG, cek.c), $$0);
   }

   protected boolean a(arc $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(arc $$0, E $$1, long $$2) {
      $$1.a(avz.CJ, 5.0F, 1.0F);
   }

   protected void c(arc $$0, E $$1, long $$2) {
      if ($$1.c(bvr.m)) {
         $$1.b(bvr.a);
      }

      $$1.ec().b(cej.aB);
      $$1.ec().c(cej.B).filter($$1::b).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.d($$1x);
         }

         if (!$$1.ec().a(cej.az)) {
            cny.a($$1, $$1x.dw());
         }
      });
   }
}
