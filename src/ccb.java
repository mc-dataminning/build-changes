import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class ccb {
   @Nullable
   public static etf a(brm $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static etf a(brm $$0, int $$1, int $$2, ToDoubleFunction<im> $$3) {
      boolean $$4 = cbz.a($$0, $$1);
      return ccc.a(() -> {
         im $$4x = ccc.a($$0.ej(), $$1, $$2);
         im $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static etf a(brm $$0, int $$1, int $$2, etf $$3) {
      etf $$4 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$5 = cbz.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static etf b(brm $$0, int $$1, int $$2, etf $$3) {
      etf $$4 = $$0.dl().d($$3);
      boolean $$5 = cbz.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static etf a(brm $$0, int $$1, int $$2, etf $$3, boolean $$4) {
      return ccc.a($$0, () -> {
         im $$5 = ccc.a($$0.ej(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            im $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static im a(brm $$0, im $$1) {
      $$1 = ccc.a($$1, $$0.dN().al(), $$1x -> cbz.c($$0, $$1x));
      return !cbz.a($$0, $$1) && !cbz.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static im a(brm $$0, int $$1, boolean $$2, im $$3) {
      im $$4 = ccc.a($$0, $$1, $$0.ej(), $$3);
      return !cbz.a($$4, $$0) && !cbz.a($$2, $$0, $$4) && !cbz.a($$0.K(), $$4) ? $$4 : null;
   }
}
