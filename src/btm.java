import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class btm<E extends bre & cjw> extends bsw<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bre, Optional<buk>> e;
   private final float f;

   public btm(Function<bre, Optional<buk>> $$0, float $$1, int $$2) {
      super(Map.of(cah.n, cai.c, cah.m, cai.c, cah.aP, cai.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aqe $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aqe $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aqe $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bsy.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aqe $$0, E $$1, long $$2) {
      Optional<buk> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         buk $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bv());
         if ($$5 < 3.0) {
            csd $$6 = $$1.y().a(0, 1);
            if (!$$6.d()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cdz $$7) {
                  cea.a((bre)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dQ().a(cah.aP, 60);
            }
         }
      }
   }

   private void a(buk $$0, csd $$1, aqf $$2) {
      im $$3 = $$0.b().d();
      am.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().c()) {
         return false;
      } else {
         Optional<buk> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static etf a(buk $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bre $$0, csd $$1, etf $$2) {
      etf $$3 = new etf(0.2F, 0.3F, 0.2F);
      bsy.a($$0, $$1, $$2, $$3, 0.2F);
      czu $$4 = $$0.dN();
      if ($$4.Y() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(cdz.d, $$4.E_());
         $$4.a(null, $$0, auz.g, ava.g, 1.0F, $$5);
      }
   }
}
