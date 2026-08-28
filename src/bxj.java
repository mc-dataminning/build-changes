import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxj<E extends bva & cnw> extends bwt<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bva, Optional<byh>> e;
   private final float f;

   public bxj(Function<bva, Optional<byh>> $$0, float $$1, int $$2) {
      super(Map.of(cee.n, cef.c, cee.m, cef.c, cee.aP, cef.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arn $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arn $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arn $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bwv.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arn $$0, E $$1, long $$2) {
      Optional<byh> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byh $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bG());
         if ($$5 < 3.0) {
            cwb $$6 = $$1.y().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof chx $$7) {
                  chy.a((bva)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ed().a(cee.aP, 60);
            }
         }
      }
   }

   private void a(byh $$0, cwb $$1, aro $$2) {
      jh $$3 = $$0.b().e();
      ao.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<byh> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ezn a(byh $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bva $$0, cwb $$1, ezn $$2) {
      ezn $$3 = new ezn(0.2F, 0.3F, 0.2F);
      bwv.a($$0, $$1, $$2, $$3, 0.2F);
      dfb $$4 = $$0.dX();
      if ($$4.aa() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ae.<Float>a(chx.d, $$4.E_());
         $$4.a(null, $$0, awl.g, awm.g, 1.0F, $$5);
      }
   }
}
