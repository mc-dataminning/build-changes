import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvy<E extends btp & cmi> extends bvi<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<btp, Optional<bww>> e;
   private final float f;

   public bvy(Function<btp, Optional<bww>> $$0, float $$1, int $$2) {
      super(Map.of(cct.n, ccu.c, cct.m, ccu.c, cct.aP, ccu.c), $$2);
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
      this.e.apply($$1).ifPresent($$1x -> bvk.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arf $$0, E $$1, long $$2) {
      Optional<bww> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bww $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cup $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cgl $$7) {
                  cgm.a((btp)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(cct.aP, 60);
            }
         }
      }
   }

   private void a(bww $$0, cup $$1, arg $$2) {
      iz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bww> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static evr a(bww $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(btp $$0, cup $$1, evr $$2) {
      evr $$3 = new evr(0.2F, 0.3F, 0.2F);
      bvk.a($$0, $$1, $$2, $$3, 0.2F);
      dby $$4 = $$0.dP();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cgl.d, $$4.E_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
