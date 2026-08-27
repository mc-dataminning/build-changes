import com.google.common.collect.ImmutableMap;

public class bse<E extends ceu> extends bof<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public bse(int $$0) {
      super(ImmutableMap.of(bvq.aB, bvr.a, bvq.o, bvr.b, bvq.m, bvr.b, bvq.n, bvr.c, bvq.B, bvr.c, bvq.az, bvr.c, bvq.aG, bvr.c), $$0);
   }

   protected boolean a(ane $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(ane $$0, E $$1, long $$2) {
      $$1.a(art.AZ, 5.0F, 1.0F);
   }

   protected void c(ane $$0, E $$1, long $$2) {
      if ($$1.c(bna.m)) {
         $$1.b(bna.a);
      }

      $$1.dN().b(bvq.aB);
      $$1.dN().c(bvq.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dN().a(bvq.az)) {
            cev.a($$1, $$1x.dl());
         }
      });
   }
}
