import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cen {
   @Nullable
   public static evr a(bty $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static evr a(bty $$0, int $$1, int $$2, ToDoubleFunction<iz> $$3) {
      boolean $$4 = cel.a($$0, $$1);
      return ceo.a(() -> {
         iz $$4x = ceo.a($$0.el(), $$1, $$2);
         iz $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static evr a(bty $$0, int $$1, int $$2, evr $$3) {
      evr $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = cel.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static evr b(bty $$0, int $$1, int $$2, evr $$3) {
      evr $$4 = $$0.dn().d($$3);
      boolean $$5 = cel.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static evr a(bty $$0, int $$1, int $$2, evr $$3, boolean $$4) {
      return ceo.a($$0, () -> {
         iz $$5 = ceo.a($$0.el(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iz $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iz a(bty $$0, iz $$1) {
      $$1 = ceo.a($$1, $$0.dP().am(), $$1x -> cel.c($$0, $$1x));
      return !cel.a($$0, $$1) && !cel.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iz a(bty $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = ceo.a($$0, $$1, $$0.el(), $$3);
      return !cel.a($$4, $$0) && !cel.a($$2, $$0, $$4) && !cel.a($$0.K(), $$4) ? $$4 : null;
   }
}
