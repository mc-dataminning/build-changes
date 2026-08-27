import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bnf<E extends bky & ccx> extends bmp<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bky, Optional<boc>> e;
   private final float f;

   public bnf(Function<bky, Optional<boc>> $$0, float $$1, int $$2) {
      super(Map.of(btz.n, bua.c, btz.m, bua.c, btz.aO, bua.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ama $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ama $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ama $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bmr.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ama $$0, E $$1, long $$2) {
      Optional<boc> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         boc $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            clb $$6 = $$1.y().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bxn $$7) {
                  bxo.a((bky)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dN().a(btz.aO, 60);
            }
         }
      }
   }

   private void a(boc $$0, clb $$1, amb $$2) {
      ht $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().ai_()) {
         return false;
      } else {
         Optional<boc> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eji a(boc $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bky $$0, clb $$1, eji $$2) {
      eji $$3 = new eji(0.2F, 0.3F, 0.2F);
      bmr.a($$0, $$1, $$2, $$3, 0.2F);
      crs $$4 = $$0.dL();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bxn.d, $$4.E_());
         $$4.a(null, $$0, aqn.g, aqo.g, 1.0F, $$5);
      }
   }
}
