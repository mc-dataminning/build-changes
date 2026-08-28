import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class byg<E extends bvx & coy> extends bxq<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bvx, Optional<bze>> e;
   private final float f;

   public byg(Function<bvx, Optional<bze>> $$0, float $$1, int $$2) {
      super(Map.of(cfb.n, cfc.c, cfb.m, cfc.c, cfb.aP, cfc.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arx $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arx $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arx $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bxs.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arx $$0, E $$1, long $$2) {
      Optional<bze> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bze $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cxg $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof ciu $$7) {
                  civ.a((bvx)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ec().a(cfb.aP, 60);
            }
         }
      }
   }

   private void a(bze $$0, cxg $$1, ary $$2) {
      jh $$3 = $$0.b().e();
      ao.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<bze> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fbr a(bze $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvx $$0, cxg $$1, fbr $$2) {
      fbr $$3 = new fbr(0.2F, 0.3F, 0.2F);
      bxs.a($$0, $$1, $$2, $$3, 0.2F);
      dgz $$4 = $$0.dW();
      if ($$4.ad() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ae.<Float>a(ciu.d, $$4.H_());
         $$4.a(null, $$0, awv.g, aww.g, 1.0F, $$5);
      }
   }
}
