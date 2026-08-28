import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bzj<E extends bxc & cqi> extends byt<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bxc, Optional<cah>> e;
   private final float f;

   public bzj(Function<bxc, Optional<cah>> $$0, float $$1, int $$2) {
      super(Map.of(cge.o, cgf.c, cge.n, cgf.c, cge.aQ, cgf.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arq $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arq $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arq $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> byv.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arq $$0, E $$1, long $$2) {
      Optional<cah> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         cah $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bE());
         if ($$5 < 3.0) {
            cyy $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof ckd $$7) {
                  cke.a((bxc)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cge.aQ, 60);
            }
         }
      }
   }

   private void a(cah $$0, cyy $$1, arr $$2) {
      iu $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<cah> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fei a(cah $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bxc $$0, cyy $$1, fei $$2) {
      fei $$3 = new fei(0.2F, 0.3F, 0.2F);
      byv.a($$0, $$1, $$2, $$3, 0.2F);
      div $$4 = $$0.dV();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(ckd.d, $$4.C_());
         $$4.a(null, $$0, awn.g, awo.g, 1.0F, $$5);
      }
   }
}
