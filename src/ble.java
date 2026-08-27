import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class ble<E extends biw & caw> extends bko<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<biw, Optional<bmb>> e;
   private final float f;

   public ble(Function<biw, Optional<bmb>> $$0, float $$1, int $$2) {
      super(Map.of(bry.n, brz.c, bry.m, brz.c, bry.aO, brz.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aki $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aki $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aki $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bkq.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aki $$0, E $$1, long $$2) {
      Optional<bmb> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bmb $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            ciw $$6 = $$1.t().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bvm $$7) {
                  bvn.a((biw)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dM().a(bry.aO, 60);
            }
         }
      }
   }

   private void a(bmb $$0, ciw $$1, akj $$2) {
      gv $$3 = $$0.b().d();
      ai.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().ab_()) {
         return false;
      } else {
         Optional<bmb> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ehf a(bmb $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(biw $$0, ciw $$1, ehf $$2) {
      ehf $$3 = new ehf(0.2F, 0.3F, 0.2F);
      bkq.a($$0, $$1, $$2, $$3, 0.2F);
      cpk $$4 = $$0.dK();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bvm.d, $$4.y_());
         $$4.a(null, $$0, aou.g, aov.g, 1.0F, $$5);
      }
   }
}
