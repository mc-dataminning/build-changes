import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bui<E extends bsa & cks> extends bts<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bsa, Optional<bvg>> e;
   private final float f;

   public bui(Function<bsa, Optional<bvg>> $$0, float $$1, int $$2) {
      super(Map.of(cbd.n, cbe.c, cbd.m, cbe.c, cbd.aP, cbe.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqh $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqh $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqh $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> btu.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqh $$0, E $$1, long $$2) {
      Optional<bvg> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bvg $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bv());
         if ($$5 < 3.0) {
            csz $$6 = $$1.y().a(0, 1);
            if (!$$6.d()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cev $$7) {
                  cew.a((bsa)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dQ().a(cbd.aP, 60);
            }
         }
      }
   }

   private void a(bvg $$0, csz $$1, aqi $$2) {
      in $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<bvg> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static etp a(bvg $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bsa $$0, csz $$1, etp $$2) {
      etp $$3 = new etp(0.2F, 0.3F, 0.2F);
      btu.a($$0, $$1, $$2, $$3, 0.2F);
      dad $$4 = $$0.dN();
      if ($$4.Y() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cev.d, $$4.E_());
         $$4.a(null, $$0, avc.g, avd.g, 1.0F, $$5);
      }
   }
}
