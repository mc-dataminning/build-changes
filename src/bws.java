import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bws<E extends buk & cnf> extends bwc<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<buk, Optional<bxq>> e;
   private final float f;

   public bws(Function<buk, Optional<bxq>> $$0, float $$1, int $$2) {
      super(Map.of(cdn.n, cdo.c, cdn.m, cdo.c, cdn.aP, cdo.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arh $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arh $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arh $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bwe.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arh $$0, E $$1, long $$2) {
      Optional<bxq> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bxq $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bC());
         if ($$5 < 3.0) {
            cvp $$6 = $$1.y().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof chg $$7) {
                  chh.a((buk)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dX().a(cdn.aP, 60);
            }
         }
      }
   }

   private void a(bxq $$0, cvp $$1, ari $$2) {
      je $$3 = $$0.b().e();
      an.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bxq> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eys a(bxq $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(buk $$0, cvp $$1, eys $$2) {
      eys $$3 = new eys(0.2F, 0.3F, 0.2F);
      bwe.a($$0, $$1, $$2, $$3, 0.2F);
      deg $$4 = $$0.dS();
      if ($$4.aa() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ad.<Float>a(chg.d, $$4.C_());
         $$4.a(null, $$0, awe.g, awf.g, 1.0F, $$5);
      }
   }
}
