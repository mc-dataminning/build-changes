import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvw<E extends btn & cmg> extends bvg<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<btn, Optional<bwu>> e;
   private final float f;

   public bvw(Function<btn, Optional<bwu>> $$0, float $$1, int $$2) {
      super(Map.of(ccr.n, ccs.c, ccr.m, ccs.c, ccr.aP, ccs.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(are $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(are $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(are $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bvi.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(are $$0, E $$1, long $$2) {
      Optional<bwu> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwu $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cun $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cgj $$7) {
                  cgk.a((btn)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(ccr.aP, 60);
            }
         }
      }
   }

   private void a(bwu $$0, cun $$1, arf $$2) {
      iz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bwu> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static evp a(bwu $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(btn $$0, cun $$1, evp $$2) {
      evp $$3 = new evp(0.2F, 0.3F, 0.2F);
      bvi.a($$0, $$1, $$2, $$3, 0.2F);
      dbw $$4 = $$0.dP();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cgj.d, $$4.E_());
         $$4.a(null, $$0, avz.g, awa.g, 1.0F, $$5);
      }
   }
}
