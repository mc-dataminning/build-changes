import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxp<E extends bvg & cof> extends bwz<E> {
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
   protected boolean a(ard $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(ard $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(ard $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bxb.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(ard $$0, E $$1, long $$2) {
      Optional<byn> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         byn $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cwo $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cid $$7) {
                  cie.a((bvg)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cek.aP, 60);
            }
         }
      }
   }

   private void a(byn $$0, cwo $$1, are $$2) {
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

   private static faz a(byn $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvg $$0, cwo $$1, faz $$2) {
      faz $$3 = new faz(0.2F, 0.3F, 0.2F);
      bxb.a($$0, $$1, $$2, $$3, 0.2F);
      dgh $$4 = $$0.dV();
      if ($$4.ad() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(cid.d, $$4.H_());
         $$4.a(null, $$0, awa.g, awb.g, 1.0F, $$5);
      }
   }
}
