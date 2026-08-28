import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bwa<E extends btr & cmk> extends bvk<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<btr, Optional<bwy>> e;
   private final float f;

   public bwa(Function<btr, Optional<bwy>> $$0, float $$1, int $$2) {
      super(Map.of(ccv.n, ccw.c, ccv.m, ccw.c, ccv.aP, ccw.c), $$2);
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
      this.e.apply($$1).ifPresent($$1x -> bvm.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arf $$0, E $$1, long $$2) {
      Optional<bwy> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwy $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cur $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cgn $$7) {
                  cgo.a((btr)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dS().a(ccv.aP, 60);
            }
         }
      }
   }

   private void a(bwy $$0, cur $$1, arg $$2) {
      iz $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bwy> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static evt a(bwy $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(btr $$0, cur $$1, evt $$2) {
      evt $$3 = new evt(0.2F, 0.3F, 0.2F);
      bvm.a($$0, $$1, $$2, $$3, 0.2F);
      dca $$4 = $$0.dP();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cgn.d, $$4.E_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
