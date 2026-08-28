import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvx<E extends bto & cmh> extends bvh<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bto, Optional<bwv>> e;
   private final float f;

   public bvx(Function<bto, Optional<bwv>> $$0, float $$1, int $$2) {
      super(Map.of(ccs.n, cct.c, ccs.m, cct.c, ccs.aP, cct.c), $$2);
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
      this.e.apply($$1).ifPresent($$1x -> bvj.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(are $$0, E $$1, long $$2) {
      Optional<bwv> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwv $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cuo $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cgk $$7) {
                  cgl.a((bto)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(ccs.aP, 60);
            }
         }
      }
   }

   private void a(bwv $$0, cuo $$1, arf $$2) {
      iz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bwv> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static evq a(bwv $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bto $$0, cuo $$1, evq $$2) {
      evq $$3 = new evq(0.2F, 0.3F, 0.2F);
      bvj.a($$0, $$1, $$2, $$3, 0.2F);
      dbx $$4 = $$0.dP();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cgk.d, $$4.E_());
         $$4.a(null, $$0, avz.g, awa.g, 1.0F, $$5);
      }
   }
}
