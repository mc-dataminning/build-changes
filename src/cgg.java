import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cgg {
   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2, ToDoubleFunction<ji> $$3) {
      boolean $$4 = cge.a($$0, $$1);
      return cgh.a(() -> {
         ji $$4x = cgh.a($$0.dY(), $$1, $$2);
         ji $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fbb a(bvq $$0, int $$1, int $$2, fbb $$3) {
      fbb $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = cge.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fbb b(bvq $$0, int $$1, int $$2, fbb $$3) {
      fbb $$4 = $$0.dt().d($$3);
      boolean $$5 = cge.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fbb a(bvq $$0, int $$1, int $$2, fbb $$3, boolean $$4) {
      return cgh.a($$0, () -> {
         ji $$5 = cgh.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ji $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ji a(bvq $$0, ji $$1) {
      $$1 = cgh.a($$1, $$0.dV().an(), $$1x -> cge.c($$0, $$1x));
      return !cge.a($$0, $$1) && !cge.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ji a(bvq $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cgh.a($$0, $$1, $$0.dY(), $$3);
      return !cge.a($$4, $$0) && !cge.a($$2, $$0, $$4) && !cge.a($$0.P(), $$4) ? $$4 : null;
   }
}
