import com.google.common.collect.ImmutableMap;

public class bqn<E extends ccq> extends bmp<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bqn(int $$0) {
      super(ImmutableMap.of(btz.aA, bua.a, btz.o, bua.b, btz.m, bua.b, btz.n, bua.c, btz.B, bua.c, btz.ay, bua.c, btz.aF, bua.c), $$0);
   }

   protected boolean a(ama $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ama $$0, E $$1, long $$2) {
      $$1.a(aqn.zO, 5.0F, 1.0F);
   }

   protected void c(ama $$0, E $$1, long $$2) {
      if ($$1.c(blk.m)) {
         $$1.b(blk.a);
      }

      $$1.dN().b(btz.aA);
      $$1.dN().c(btz.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dN().a(btz.ay)) {
            ccr.a($$1, $$1x.dl());
         }
      });
   }
}
