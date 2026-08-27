import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bns<E extends bll & cdk> extends bnc<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bll, Optional<bop>> e;
   private final float f;

   public bns(Function<bll, Optional<bop>> $$0, float $$1, int $$2) {
      super(Map.of(bum.n, bun.c, bum.m, bun.c, bum.aO, bun.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ami $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ami $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ami $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bne.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ami $$0, E $$1, long $$2) {
      Optional<bop> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bop $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            clo $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bya $$7) {
                  byb.a((bll)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dP().a(bum.aO, 60);
            }
         }
      }
   }

   private void a(bop $$0, clo $$1, amj $$2) {
      hx $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().aj_()) {
         return false;
      } else {
         Optional<bop> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ejz a(bop $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bll $$0, clo $$1, ejz $$2) {
      ejz $$3 = new ejz(0.2F, 0.3F, 0.2F);
      bne.a($$0, $$1, $$2, $$3, 0.2F);
      csf $$4 = $$0.dN();
      if ($$4.W() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bya.d, $$4.F_());
         $$4.a(null, $$0, aqv.g, aqw.g, 1.0F, $$5);
      }
   }
}
