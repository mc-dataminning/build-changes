import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class byy<E extends bwr & cps> extends byi<E> {
   private static final int c = 3;
   private static final int d = 60;
   private final Function<bwr, Optional<bzw>> e;
   private final float f;

   public byy(Function<bwr, Optional<bzw>> $$0, float $$1, int $$2) {
      super(Map.of(cft.o, cfu.c, cft.n, cfu.c, cft.aQ, cfu.c), $$2);
      this.e = $$0;
      this.f = $$1;
   }

   @Override
   protected boolean a(arn $$0, E $$1) {
      return this.b($$1);
   }

   @Override
   protected boolean a(arn $$0, E $$1, long $$2) {
      return this.b($$1);
   }

   @Override
   protected void d(arn $$0, E $$1, long $$2) {
      this.e.apply($$1).ifPresent($$1x -> byk.a($$1, $$1x, this.f, 3));
   }

   @Override
   protected void c(arn $$0, E $$1, long $$2) {
      Optional<bzw> $$3 = this.e.apply($$1);
      if (!$$3.isEmpty()) {
         bzw $$4 = $$3.get();
         double $$5 = $$4.a().f($$1.bE());
         if ($$5 < 3.0) {
            cxy $$6 = $$1.n().a(0, 1);
            if (!$$6.f()) {
               a($$1, $$6, a($$4));
               if ($$1 instanceof cjp $$7) {
                  cjq.a((bwr)$$7).ifPresent($$2x -> this.a($$4, $$6, $$2x));
               }

               $$1.eb().a(cft.aQ, 60);
            }
         }
      }
   }

   private void a(bzw $$0, cxy $$1, aro $$2) {
      jj $$3 = $$0.b().e();
      ap.aa.a($$2, $$3, $$1);
   }

   private boolean b(E $$0) {
      if ($$0.n().c()) {
         return false;
      } else {
         Optional<bzw> $$1 = this.e.apply($$0);
         return $$1.isPresent();
      }
   }

   private static fcu a(bzw $$0) {
      return $$0.a().b(0.0, 1.0, 0.0);
   }

   public static void a(bwr $$0, cxy $$1, fcu $$2) {
      fcu $$3 = new fcu(0.2F, 0.3F, 0.2F);
      byk.a($$0, $$1, $$2, $$3, 0.2F);
      dhp $$4 = $$0.dV();
      if ($$4.ae() % 7L == 0L && $$4.A.j() < 0.9) {
         float $$5 = af.<Float>a(cjp.d, $$4.C_());
         $$4.a(null, $$0, awk.g, awl.g, 1.0F, $$5);
      }
   }
}
