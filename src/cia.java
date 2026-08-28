import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cia {
   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2, ToDoubleFunction<iu> $$3) {
      boolean $$4 = chy.a($$0, $$1);
      return cib.a(() -> {
         iu $$4x = cib.a($$0.dY(), $$1, $$2);
         iu $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static feq a(bxm $$0, int $$1, int $$2, feq $$3) {
      feq $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = chy.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static feq b(bxm $$0, int $$1, int $$2, feq $$3) {
      feq $$4 = $$0.dt().d($$3);
      boolean $$5 = chy.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static feq a(bxm $$0, int $$1, int $$2, feq $$3, boolean $$4) {
      return cib.a($$0, () -> {
         iu $$5 = cib.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iu $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iu a(bxm $$0, iu $$1) {
      $$1 = cib.a($$1, $$0.dV().ao(), $$1x -> chy.c($$0, $$1x));
      return !chy.a($$0, $$1) && !chy.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iu a(bxm $$0, int $$1, boolean $$2, iu $$3) {
      iu $$4 = cib.a($$0, $$1, $$0.dY(), $$3);
      return !chy.a($$4, $$0) && !chy.a($$2, $$0, $$4) && !chy.a($$0.O(), $$4) ? $$4 : null;
   }
}
