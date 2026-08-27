import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class blt<E extends bjm & cbl> extends bld<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bjm, Optional<bmq>> e;
   private final float f;

   public blt(Function<bjm, Optional<bmq>> $$0, float $$1, int $$2) {
      super(Map.of(bsn.n, bso.c, bsn.m, bso.c, bsn.aO, bso.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(akt $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(akt $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(akt $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> blf.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(akt $$0, E $$1, long $$2) {
      Optional<bmq> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bmq $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bp());
         if ($$5 < 3.0) {
            cjl $$6 = $$1.y().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bwb $$7) {
                  bwc.a((bjm)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dN().a(bsn.aO, 60);
            }
         }
      }
   }

   private void a(bmq $$0, cjl $$1, aku $$2) {
      gw $$3 = $$0.b().d();
      al.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.y().af_()) {
         return false;
      } else {
         Optional<bmq> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static ehh a(bmq $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bjm $$0, cjl $$1, ehh $$2) {
      ehh $$3 = new ehh(0.2F, 0.3F, 0.2F);
      blf.a($$0, $$1, $$2, $$3, 0.2F);
      cqb $$4 = $$0.dL();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bwb.d, $$4.D_());
         $$4.a(null, $$0, apg.g, aph.g, 1.0F, $$5);
      }
   }
}
