import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvz<E extends btq & cmj> extends bvj<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<btq, Optional<bwx>> e;
   private final float f;

   public bvz(Function<btq, Optional<bwx>> $$0, float $$1, int $$2) {
      super(Map.of(ccu.n, ccv.c, ccu.m, ccv.c, ccu.aP, ccv.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arf $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arf $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arf $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bvl.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arf $$0, E $$1, long $$2) {
      Optional<bwx> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwx $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cuq $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cgm $$7) {
                  cgn.a((btq)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(ccu.aP, 60);
            }
         }
      }
   }

   private void a(bwx $$0, cuq $$1, arg $$2) {
      iz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bwx> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static evs a(bwx $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(btq $$0, cuq $$1, evs $$2) {
      evs $$3 = new evs(0.2F, 0.3F, 0.2F);
      bvl.a($$0, $$1, $$2, $$3, 0.2F);
      dbz $$4 = $$0.dP();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cgm.d, $$4.E_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
