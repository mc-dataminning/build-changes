import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bxo<E extends bvf & coe> extends bwy<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bvf, Optional<bym>> e;
   private final float f;

   public bxo(Function<bvf, Optional<bym>> $$0, float $$1, int $$2) {
      super(Map.of(cej.n, cek.c, cej.m, cek.c, cej.aP, cek.c), $$2);
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
      this.e.apply($$1).ifPresent($$1x -> bxa.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arc $$0, E $$1, long $$2) {
      Optional<bym> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bym $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bF());
         if ($$5 < 3.0) {
            cwn $$6 = $$1.t().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cic $$7) {
                  cid.a((bvf)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.ec().a(cej.aP, 60);
            }
         }
      }
   }

   private void a(bym $$0, cwn $$1, ard $$2) {
      ji $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.t().c()) {
         return false;
      } else {
         Optional<bym> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fay a(bym $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bvf $$0, cwn $$1, fay $$2) {
      fay $$3 = new fay(0.2F, 0.3F, 0.2F);
      bxa.a($$0, $$1, $$2, $$3, 0.2F);
      dgg $$4 = $$0.dW();
      if ($$4.ad() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(cic.d, $$4.H_());
         $$4.a(null, $$0, avz.g, awa.g, 1.0F, $$5);
      }
   }
}
