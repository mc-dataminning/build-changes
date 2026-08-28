import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cel {
   @Nullable
   public static evp a(btw $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static evp a(btw $$0, int $$1, int $$2, ToDoubleFunction<iz> $$3) {
      boolean $$4 = cej.a($$0, $$1);
      return cem.a(() -> {
         iz $$4x = cem.a($$0.el(), $$1, $$2);
         iz $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static evp a(btw $$0, int $$1, int $$2, evp $$3) {
      evp $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = cej.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static evp b(btw $$0, int $$1, int $$2, evp $$3) {
      evp $$4 = $$0.dn().d($$3);
      boolean $$5 = cej.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static evp a(btw $$0, int $$1, int $$2, evp $$3, boolean $$4) {
      return cem.a($$0, () -> {
         iz $$5 = cem.a($$0.el(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iz $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iz a(btw $$0, iz $$1) {
      $$1 = cem.a($$1, $$0.dP().am(), $$1x -> cej.c($$0, $$1x));
      return !cej.a($$0, $$1) && !cej.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iz a(btw $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = cem.a($$0, $$1, $$0.el(), $$3);
      return !cej.a($$4, $$0) && !cej.a($$2, $$0, $$4) && !cej.a($$0.K(), $$4) ? $$4 : null;
   }
}
