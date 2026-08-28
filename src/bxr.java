import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxr<E extends bvi & coh> extends bxb<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bvi, Optional<byp>> e;
   private final float f;

   public bxr(Function<bvi, Optional<byp>> $$0, float $$1, int $$2) {
      super(Map.of(cem.n, cen.c, cem.m, cen.c, cem.aP, cen.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(ard $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ard $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ard $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bxd.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ard $$0, E $$1, long $$2) {
      Optional<byp> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byp $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cwq $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cif $$7) {
                  cig.a((bvi)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cem.aP, 60);
            }
         }
      }
   }

   private void a(byp $$0, cwq $$1, are $$2) {
      ji $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<byp> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fbb a(byp $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvi $$0, cwq $$1, fbb $$2) {
      fbb $$3 = new fbb(0.2F, 0.3F, 0.2F);
      bxd.a($$0, $$1, $$2, $$3, 0.2F);
      dgj $$4 = $$0.dV();
      if ($$4.ad() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(cif.d, $$4.H_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
