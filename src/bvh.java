import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bvh<E extends bsy & cls> extends bur<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bsy, Optional<bwf>> e;
   private final float f;

   public bvh(Function<bsy, Optional<bwf>> $$0, float $$1, int $$2) {
      super(Map.of(ccc.n, ccd.c, ccc.m, ccd.c, ccc.aP, ccd.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqk $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqk $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqk $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> but.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqk $$0, E $$1, long $$2) {
      Optional<bwf> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bwf $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bx());
         if ($$5 < 3.0) {
            cua $$6 = $$1.y().a(0, 1);
            if (!$$6.e()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cfu $$7) {
                  cfv.a((bsy)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dT().a(ccc.aP, 60);
            }
         }
      }
   }

   private void a(bwf $$0, cua $$1, aql $$2) {
      ja $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bwf> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static evz a(bwf $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bsy $$0, cua $$1, evz $$2) {
      evz $$3 = new evz(0.2F, 0.3F, 0.2F);
      but.a($$0, $$1, $$2, $$3, 0.2F);
      dcd $$4 = $$0.dP();
      if ($$4.Z() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cfu.d, $$4.E_());
         $$4.a(null, $$0, avf.g, avg.g, 1.0F, $$5);
      }
   }
}
