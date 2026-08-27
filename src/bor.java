import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bor<E extends bmk & ces> extends bob<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bmk, Optional<bpp>> e;
   private final float f;

   public bor(Function<bmk, Optional<bpp>> $$0, float $$1, int $$2) {
      super(Map.of(bvm.n, bvn.c, bvm.m, bvn.c, bvm.aO, bvn.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(and $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(and $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(and $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bod.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(and $$0, E $$1, long $$2) {
      Optional<bpp> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bpp $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.br());
         if ($$5 < 3.0) {
            cmx $$6 = $$1.A().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bzb $$7) {
                  bzc.a((bmk)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dO().a(bvm.aO, 60);
            }
         }
      }
   }

   private void a(bpp $$0, cmx $$1, ane $$2) {
      hx $$3 = $$0.b().d();
      am.Y.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.A().ai_()) {
         return false;
      } else {
         Optional<bpp> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static els a(bpp $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bmk $$0, cmx $$1, els $$2) {
      els $$3 = new els(0.2F, 0.3F, 0.2F);
      bod.a($$0, $$1, $$2, $$3, 0.2F);
      cto $$4 = $$0.dM();
      if ($$4.X() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bzb.d, $$4.F_());
         $$4.a(null, $$0, arr.g, ars.g, 1.0F, $$5);
      }
   }
}
