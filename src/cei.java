import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cei {
   @Nullable
   public static evm a(btt $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static evm a(btt $$0, int $$1, int $$2, ToDoubleFunction<iz> $$3) {
      boolean $$4 = ceg.a($$0, $$1);
      return cej.a(() -> {
         iz $$4x = cej.a($$0.el(), $$1, $$2);
         iz $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static evm a(btt $$0, int $$1, int $$2, evm $$3) {
      evm $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = ceg.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static evm b(btt $$0, int $$1, int $$2, evm $$3) {
      evm $$4 = $$0.dn().d($$3);
      boolean $$5 = ceg.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static evm a(btt $$0, int $$1, int $$2, evm $$3, boolean $$4) {
      return cej.a($$0, () -> {
         iz $$5 = cej.a($$0.el(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iz $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iz a(btt $$0, iz $$1) {
      $$1 = cej.a($$1, $$0.dP().am(), $$1x -> ceg.c($$0, $$1x));
      return !ceg.a($$0, $$1) && !ceg.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iz a(btt $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = cej.a($$0, $$1, $$0.el(), $$3);
      return !ceg.a($$4, $$0) && !ceg.a($$2, $$0, $$4) && !ceg.a($$0.K(), $$4) ? $$4 : null;
   }
}
