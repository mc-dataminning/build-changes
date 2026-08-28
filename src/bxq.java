import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxq<E extends bvh & cog> extends bxa<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bvh, Optional<byo>> e;
   private final float f;

   public bxq(Function<bvh, Optional<byo>> $$0, float $$1, int $$2) {
      super(Map.of(cel.n, cem.c, cel.m, cem.c, cel.aP, cem.c), $$2);
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
      this.e.apply($$1).ifPresent($$1x -> bxc.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ard $$0, E $$1, long $$2) {
      Optional<byo> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byo $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cwp $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cie $$7) {
                  cif.a((bvh)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cel.aP, 60);
            }
         }
      }
   }

   private void a(byo $$0, cwp $$1, are $$2) {
      ji $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<byo> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fba a(byo $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvh $$0, cwp $$1, fba $$2) {
      fba $$3 = new fba(0.2F, 0.3F, 0.2F);
      bxc.a($$0, $$1, $$2, $$3, 0.2F);
      dgi $$4 = $$0.dV();
      if ($$4.ad() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(cie.d, $$4.H_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
