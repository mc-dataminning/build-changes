import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class cad<E extends bxw & crj> extends bzn<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bxw, Optional<cbb>> e;
   private final float f;

   public cad(Function<bxw, Optional<cbb>> $$0, float $$1, int $$2) {
      super(Map.of(cgy.o, cgz.c, cgy.n, cgz.c, cgy.aQ, cgz.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aru $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aru $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aru $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bzp.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aru $$0, E $$1, long $$2) {
      Optional<cbb> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         cbb $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bD());
         if ($$5 < 3.0) {
            daa $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof ckv $$7) {
                  ckw.a((bxw)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ec().a(cgy.aQ, 60);
            }
         }
      }
   }

   private void a(cbb $$0, daa $$1, arv $$2) {
      iw $$3 = $$0.b().e();
      aq.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<cbb> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ffs a(cbb $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bxw $$0, daa $$1, ffs $$2) {
      ffs $$3 = new ffs(0.2F, 0.3F, 0.2F);
      bzp.a($$0, $$1, $$2, $$3, 0.2F);
      djz $$4 = $$0.dV();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = ag.<Float>a(ckv.d, $$4.G_());
         $$4.a(null, $$0, awr.g, aws.g, 1.0F, $$5);
      }
   }
}
