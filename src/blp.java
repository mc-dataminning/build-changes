import com.google.common.collect.ImmutableMap;

public class blp<E extends bxs> extends bhr<E> {
   private static final double c = 6.0;
   private static final double d = 20.0;

   public blp(int $$0) {
      super(ImmutableMap.of(bpb.aA, bpc.a, bpb.o, bpc.b, bpb.m, bpc.b, bpb.n, bpc.c, bpb.B, bpc.c, bpb.ay, bpc.c, bpb.aF, bpc.c), $$0);
   }

   protected boolean a(aif $$0, E $$1, long $$2) {
      return true;
   }

   protected void b(aif $$0, E $$1, long $$2) {
      $$1.a(amh.zE, 5.0F, 1.0F);
   }

   protected void c(aif $$0, E $$1, long $$2) {
      if ($$1.c(bgl.m)) {
         $$1.b(bgl.a);
      }

      $$1.dK().b(bpb.aA);
      $$1.dK().c(bpb.B).filter($$1::a).ifPresent($$1x -> {
         if ($$1.a($$1x, 6.0, 20.0)) {
            $$1.c($$1x);
         }

         if (!$$1.dK().a(bpb.ay)) {
            bxt.a($$1, $$1x.di());
         }
      });
   }
}
