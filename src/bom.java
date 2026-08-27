import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bom<E extends bmf & cem> extends bnw<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bmf, Optional<bpk>> e;
   private final float f;

   public bom(Function<bmf, Optional<bpk>> $$0, float $$1, int $$2) {
      super(Map.of(bvh.n, bvi.c, bvh.m, bvi.c, bvh.aO, bvi.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(amz $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(amz $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(amz $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bny.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(amz $$0, E $$1, long $$2) {
      Optional<bpk> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bpk $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            cmr $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof byw $$7) {
                  byx.a((bmf)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dO().a(bvh.aO, 60);
            }
         }
      }
   }

   private void a(bpk $$0, cmr $$1, ana $$2) {
      hx $$3 = $$0.b().d();
      am.Y.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().ai_()) {
         return false;
      } else {
         Optional<bpk> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static elm a(bpk $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bmf $$0, cmr $$1, elm $$2) {
      elm $$3 = new elm(0.2F, 0.3F, 0.2F);
      bny.a($$0, $$1, $$2, $$3, 0.2F);
      cti $$4 = $$0.dM();
      if ($$4.X() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(byw.d, $$4.F_());
         $$4.a(null, $$0, arm.g, arn.g, 1.0F, $$5);
      }
   }
}
