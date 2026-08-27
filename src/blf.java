import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class blf<E extends biy & cax> extends bkp<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<biy, Optional<bmc>> e;
   private final float f;

   public blf(Function<biy, Optional<bmc>> $$0, float $$1, int $$2) {
      super(Map.of(brz.n, bsa.c, brz.m, bsa.c, brz.aO, bsa.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(akk $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(akk $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(akk $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bkr.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(akk $$0, E $$1, long $$2) {
      Optional<bmc> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bmc $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            cix $$6 = $$1.t().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bvn $$7) {
                  bvo.a((biy)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dM().a(brz.aO, 60);
            }
         }
      }
   }

   private void a(bmc $$0, cix $$1, akl $$2) {
      gu $$3 = $$0.b().d();
      ai.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().aa_()) {
         return false;
      } else {
         Optional<bmc> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ehd a(bmc $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(biy $$0, cix $$1, ehd $$2) {
      ehd $$3 = new ehd(0.2F, 0.3F, 0.2F);
      bkr.a($$0, $$1, $$2, $$3, 0.2F);
      cpl $$4 = $$0.dK();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bvn.d, $$4.y_());
         $$4.a(null, $$0, aow.g, aox.g, 1.0F, $$5);
      }
   }
}
