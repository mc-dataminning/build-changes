import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class btb<E extends bqt & cjl> extends bsl<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bqt, Optional<btz>> e;
   private final float f;

   public btb(Function<bqt, Optional<btz>> $$0, float $$1, int $$2) {
      super(Map.of(bzw.n, bzx.c, bzw.m, bzx.c, bzw.aP, bzx.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(apu $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(apu $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(apu $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bsn.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(apu $$0, E $$1, long $$2) {
      Optional<btz> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         btz $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bu());
         if ($$5 < 3.0) {
            crs $$6 = $$1.y().a(0, 1);
            if (!$$6.d()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cdo $$7) {
                  cdp.a((bqt)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dP().a(bzw.aP, 60);
            }
         }
      }
   }

   private void a(btz $$0, crs $$1, apv $$2) {
      id $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<btz> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static esj a(btz $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bqt $$0, crs $$1, esj $$2) {
      esj $$3 = new esj(0.2F, 0.3F, 0.2F);
      bsn.a($$0, $$1, $$2, $$3, 0.2F);
      czg $$4 = $$0.dM();
      if ($$4.Y() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cdo.d, $$4.E_());
         $$4.a(null, $$0, auo.g, aup.g, 1.0F, $$5);
      }
   }
}
