import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class buw<E extends bso & clj> extends bug<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bso, Optional<bvu>> e;
   private final float f;

   public buw(Function<bso, Optional<bvu>> $$0, float $$1, int $$2) {
      super(Map.of(cbr.n, cbs.c, cbr.m, cbs.c, cbr.aP, cbs.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqt $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqt $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqt $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bui.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqt $$0, E $$1, long $$2) {
      Optional<bvu> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bvu $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bC());
         if ($$5 < 3.0) {
            cuh $$6 = $$1.x().a(0, 1);
            if (!$$6.d()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cfk $$7) {
                  cfl.a((bso)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dZ().a(cbr.aP, 60);
            }
         }
      }
   }

   private void a(bvu $$0, cuh $$1, aqu $$2) {
      ir $$3 = $$0.b().d();
      an.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.x().c()) {
         return false;
      } else {
         Optional<bvu> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ewu a(bvu $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bso $$0, cuh $$1, ewu $$2) {
      ewu $$3 = new ewu(0.2F, 0.3F, 0.2F);
      bui.a($$0, $$1, $$2, $$3, 0.2F);
      dca $$4 = $$0.dU();
      if ($$4.Z() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ad.<Float>a(cfk.d, $$4.F_());
         $$4.a(null, $$0, avo.g, avq.g, 1.0F, $$5);
      }
   }
}
