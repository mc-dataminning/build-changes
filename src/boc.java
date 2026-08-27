import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class boc<E extends blv & cec> extends bnm<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<blv, Optional<bpa>> e;
   private final float f;

   public boc(Function<blv, Optional<bpa>> $$0, float $$1, int $$2) {
      super(Map.of(bux.n, buy.c, bux.m, buy.c, bux.aO, buy.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(amp $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(amp $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(amp $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bno.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(amp $$0, E $$1, long $$2) {
      Optional<bpa> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bpa $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            cmh $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bym $$7) {
                  byn.a((blv)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dO().a(bux.aO, 60);
            }
         }
      }
   }

   private void a(bpa $$0, cmh $$1, amq $$2) {
      hv $$3 = $$0.b().d();
      am.Y.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().ai_()) {
         return false;
      } else {
         Optional<bpa> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static elb a(bpa $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(blv $$0, cmh $$1, elb $$2) {
      elb $$3 = new elb(0.2F, 0.3F, 0.2F);
      bno.a($$0, $$1, $$2, $$3, 0.2F);
      csy $$4 = $$0.dM();
      if ($$4.W() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bym.d, $$4.F_());
         $$4.a(null, $$0, arc.g, ard.g, 1.0F, $$5);
      }
   }
}
