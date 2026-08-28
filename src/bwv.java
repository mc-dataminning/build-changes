import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bwv<E extends bun & cni> extends bwf<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bun, Optional<bxt>> e;
   private final float f;

   public bwv(Function<bun, Optional<bxt>> $$0, float $$1, int $$2) {
      super(Map.of(cdq.n, cdr.c, cdq.m, cdr.c, cdq.aP, cdr.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arj $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arj $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arj $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bwh.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arj $$0, E $$1, long $$2) {
      Optional<bxt> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bxt $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bC());
         if ($$5 < 3.0) {
            cvs $$6 = $$1.y().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof chj $$7) {
                  chk.a((bun)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dY().a(cdq.aP, 60);
            }
         }
      }
   }

   private void a(bxt $$0, cvs $$1, ark $$2) {
      jf $$3 = $$0.b().e();
      an.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bxt> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eyw a(bxt $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bun $$0, cvs $$1, eyw $$2) {
      eyw $$3 = new eyw(0.2F, 0.3F, 0.2F);
      bwh.a($$0, $$1, $$2, $$3, 0.2F);
      dej $$4 = $$0.dS();
      if ($$4.aa() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ad.<Float>a(chj.d, $$4.D_());
         $$4.a(null, $$0, awg.g, awh.g, 1.0F, $$5);
      }
   }
}
