import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class byp<E extends bwg & cph> extends bxz<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bwg, Optional<bzn>> e;
   private final float f;

   public byp(Function<bwg, Optional<bzn>> $$0, float $$1, int $$2) {
      super(Map.of(cfk.n, cfl.c, cfk.m, cfl.c, cfk.aP, cfl.c), $$2);
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
      this.e.apply($$1).ifPresent($$1x -> byb.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ash $$0, E $$1, long $$2) {
      Optional<bzn> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bzn $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cxp $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cjd $$7) {
                  cje.a((bwg)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ec().a(cfk.aP, 60);
            }
         }
      }
   }

   private void a(bzn $$0, cxp $$1, asi $$2) {
      jh $$3 = $$0.b().e();
      ao.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<bzn> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fby a(bzn $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bwg $$0, cxp $$1, fby $$2) {
      fby $$3 = new fby(0.2F, 0.3F, 0.2F);
      byb.a($$0, $$1, $$2, $$3, 0.2F);
      dhi $$4 = $$0.dW();
      if ($$4.ac() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ae.<Float>a(cjd.d, $$4.H_());
         $$4.a(null, $$0, axf.g, axg.g, 1.0F, $$5);
      }
   }
}
