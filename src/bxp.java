import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxp<E extends bvg & cog> extends bwz<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bvg, Optional<byn>> e;
   private final float f;

   public bxp(Function<bvg, Optional<byn>> $$0, float $$1, int $$2) {
      super(Map.of(cek.n, cel.c, cek.m, cel.c, cek.aP, cel.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arc $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arc $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arc $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bxb.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arc $$0, E $$1, long $$2) {
      Optional<byn> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byn $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cwp $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cid $$7) {
                  cie.a((bvg)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ec().a(cek.aP, 60);
            }
         }
      }
   }

   private void a(byn $$0, cwp $$1, ard $$2) {
      ji $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<byn> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fba a(byn $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvg $$0, cwp $$1, fba $$2) {
      fba $$3 = new fba(0.2F, 0.3F, 0.2F);
      bxb.a($$0, $$1, $$2, $$3, 0.2F);
      dgi $$4 = $$0.dW();
      if ($$4.ad() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(cid.d, $$4.H_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
