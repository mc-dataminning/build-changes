import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bmq<E extends bkj & cci> extends bma<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bkj, Optional<bnn>> e;
   private final float f;

   public bmq(Function<bkj, Optional<bnn>> $$0, float $$1, int $$2) {
      super(Map.of(btk.n, btl.c, btk.m, btl.c, btk.aO, btl.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(alq $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(alq $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(alq $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bmc.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(alq $$0, E $$1, long $$2) {
      Optional<bnn> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bnn $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            ckj $$6 = $$1.y().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bwy $$7) {
                  bwz.a((bkj)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dN().a(btk.aO, 60);
            }
         }
      }
   }

   private void a(bnn $$0, ckj $$1, alr $$2) {
      ht $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().ai_()) {
         return false;
      } else {
         Optional<bnn> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eif a(bnn $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bkj $$0, ckj $$1, eif $$2) {
      eif $$3 = new eif(0.2F, 0.3F, 0.2F);
      bmc.a($$0, $$1, $$2, $$3, 0.2F);
      cqz $$4 = $$0.dL();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bwy.d, $$4.E_());
         $$4.a(null, $$0, aqd.g, aqe.g, 1.0F, $$5);
      }
   }
}
