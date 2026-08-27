import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class bih<E extends bfz & bxz> extends bhr<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bfz, Optional<bje>> e;
   private final float f;

   public bih(Function<bfz, Optional<bje>> $$0, float $$1, int $$2) {
      super(Map.of(bpb.n, bpc.c, bpb.m, bpc.c, bpb.aO, bpc.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(aif $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(aif $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(aif $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> bht.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(aif $$0, E $$1, long $$2) {
      Optional<bje> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bje $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bm());
         if ($$5 < 3.0) {
            cfz $$6 = $$1.w().a(0, 1);
            if (!$$6.b()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof bsp $$7) {
                  bsq.a((bfz)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.dK().a(bpb.aO, 60);
            }
         }
      }
   }

   private void a(bje $$0, cfz $$1, aig $$2) {
      gu $$3 = $$0.b().d();
      ai.X.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.w().ab_()) {
         return false;
      } else {
         Optional<bje> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static eei a(bje $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bfz $$0, cfz $$1, eei $$2) {
      eei $$3 = new eei(0.2F, 0.3F, 0.2F);
      bht.a($$0, $$1, $$2, $$3, 0.2F);
      cmm $$4 = $$0.dI();
      if ($$4.V() % 7L == 0L && $$4.z.j() < 0.9) {
         float $$5 = ac.<Float>a(bsp.d, $$4.y_());
         $$4.a(null, $$0, amh.g, ami.g, 1.0F, $$5);
      }
   }
}
