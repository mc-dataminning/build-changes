import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class byk<E extends bwb & cpc> extends bxu<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bwb, Optional<bzi>> e;
   private final float f;

   public byk(Function<bwb, Optional<bzi>> $$0, float $$1, int $$2) {
      super(Map.of(cff.n, cfg.c, cff.m, cfg.c, cff.aP, cfg.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ash $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ash $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ash $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bxw.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ash $$0, E $$1, long $$2) {
      Optional<bzi> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bzi $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cxk $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof ciy $$7) {
                  ciz.a((bwb)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cff.aP, 60);
            }
         }
      }
   }

   private void a(bzi $$0, cxk $$1, asi $$2) {
      jh $$3 = $$0.b().e();
      ao.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<bzi> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fbs a(bzi $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bwb $$0, cxk $$1, fbs $$2) {
      fbs $$3 = new fbs(0.2F, 0.3F, 0.2F);
      bxw.a($$0, $$1, $$2, $$3, 0.2F);
      dha $$4 = $$0.dV();
      if ($$4.ac() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ae.<Float>a(ciy.c, $$4.H_());
         $$4.a(null, $$0, axf.g, axg.g, 1.0F, $$5);
      }
   }
}
