import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bli<E extends bjb & cba> extends bks<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bjb, Optional<bmf>> e;
   private final float f;

   public bli(Function<bjb, Optional<bmf>> $$0, float $$1, int $$2) {
      super(Map.of(bsc.n, bsd.c, bsc.m, bsd.c, bsc.aO, bsd.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(akn $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(akn $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(akn $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bku.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(akn $$0, E $$1, long $$2) {
      Optional<bmf> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bmf $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            cja $$6 = $$1.t().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bvq $$7) {
                  bvr.a((bjb)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dM().a(bsc.aO, 60);
            }
         }
      }
   }

   private void a(bmf $$0, cja $$1, ako $$2) {
      gw $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().aa_()) {
         return false;
      } else {
         Optional<bmf> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ehi a(bmf $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bjb $$0, cja $$1, ehi $$2) {
      ehi $$3 = new ehi(0.2F, 0.3F, 0.2F);
      bku.a($$0, $$1, $$2, $$3, 0.2F);
      cpq $$4 = $$0.dK();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bvq.d, $$4.y_());
         $$4.a(null, $$0, aoz.g, apa.g, 1.0F, $$5);
      }
   }
}
