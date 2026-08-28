import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class cab<E extends bxu & crh> extends bzl<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bxu, Optional<caz>> e;
   private final float f;

   public cab(Function<bxu, Optional<caz>> $$0, float $$1, int $$2) {
      super(Map.of(cgw.o, cgx.c, cgw.n, cgx.c, cgw.aQ, cgx.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ars $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ars $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ars $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bzn.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ars $$0, E $$1, long $$2) {
      Optional<caz> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         caz $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bD());
         if ($$5 < 3.0) {
            czy $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof ckt $$7) {
                  cku.a((bxu)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ec().a(cgw.aQ, 60);
            }
         }
      }
   }

   private void a(caz $$0, czy $$1, art $$2) {
      iv $$3 = $$0.b().e();
      aq.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<caz> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ffq a(caz $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bxu $$0, czy $$1, ffq $$2) {
      ffq $$3 = new ffq(0.2F, 0.3F, 0.2F);
      bzn.a($$0, $$1, $$2, $$3, 0.2F);
      djx $$4 = $$0.dV();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ag.<Float>a(ckt.d, $$4.G_());
         $$4.a(null, $$0, awp.g, awq.g, 1.0F, $$5);
      }
   }
}
