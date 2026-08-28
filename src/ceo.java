import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class ceo {
   @Nullable
   public static evs a(btz $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static evs a(btz $$0, int $$1, int $$2, ToDoubleFunction<iz> $$3) {
      boolean $$4 = cem.a($$0, $$1);
      return cep.a(() -> {
         iz $$4x = cep.a($$0.el(), $$1, $$2);
         iz $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static evs a(btz $$0, int $$1, int $$2, evs $$3) {
      evs $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = cem.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static evs b(btz $$0, int $$1, int $$2, evs $$3) {
      evs $$4 = $$0.dn().d($$3);
      boolean $$5 = cem.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static evs a(btz $$0, int $$1, int $$2, evs $$3, boolean $$4) {
      return cep.a($$0, () -> {
         iz $$5 = cep.a($$0.el(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iz $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iz a(btz $$0, iz $$1) {
      $$1 = cep.a($$1, $$0.dP().am(), $$1x -> cem.c($$0, $$1x));
      return !cem.a($$0, $$1) && !cem.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iz a(btz $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = cep.a($$0, $$1, $$0.el(), $$3);
      return !cem.a($$4, $$0) && !cem.a($$2, $$0, $$4) && !cem.a($$0.K(), $$4) ? $$4 : null;
   }
}
