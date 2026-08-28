import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cdz {
   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2, ToDoubleFunction<ja> $$3) {
      boolean $$4 = cdx.a($$0, $$1);
      return cea.a(() -> {
         ja $$4x = cea.a($$0.dT(), $$1, $$2);
         ja $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2, ewf $$3) {
      ewf $$4 = $$3.a($$0.dv(), $$0.dx(), $$0.dB());
      boolean $$5 = cdx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ewf b(btk $$0, int $$1, int $$2, ewf $$3) {
      ewf $$4 = $$0.do().d($$3);
      boolean $$5 = cdx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ewf a(btk $$0, int $$1, int $$2, ewf $$3, boolean $$4) {
      return cea.a($$0, () -> {
         ja $$5 = cea.a($$0.dT(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ja $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ja a(btk $$0, ja $$1) {
      $$1 = cea.a($$1, $$0.dQ().am(), $$1x -> cdx.c($$0, $$1x));
      return !cdx.a($$0, $$1) && !cdx.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ja a(btk $$0, int $$1, boolean $$2, ja $$3) {
      ja $$4 = cea.a($$0, $$1, $$0.dT(), $$3);
      return !cdx.a($$4, $$0) && !cdx.a($$2, $$0, $$4) && !cdx.a($$0.K(), $$4) ? $$4 : null;
   }
}
