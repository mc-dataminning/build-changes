import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cdl {
   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2, ToDoubleFunction<ir> $$3) {
      boolean $$4 = cdj.a($$0, $$1);
      return cdm.a(() -> {
         ir $$4x = cdm.a($$0.et(), $$1, $$2);
         ir $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2, ewu $$3) {
      ewu $$4 = $$3.a($$0.dz(), $$0.dB(), $$0.dF());
      boolean $$5 = cdj.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ewu b(bsw $$0, int $$1, int $$2, ewu $$3) {
      ewu $$4 = $$0.ds().d($$3);
      boolean $$5 = cdj.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ewu a(bsw $$0, int $$1, int $$2, ewu $$3, boolean $$4) {
      return cdm.a($$0, () -> {
         ir $$5 = cdm.a($$0.et(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ir $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ir a(bsw $$0, ir $$1) {
      $$1 = cdm.a($$1, $$0.dU().am(), $$1x -> cdj.c($$0, $$1x));
      return !cdj.a($$0, $$1) && !cdj.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ir a(bsw $$0, int $$1, boolean $$2, ir $$3) {
      ir $$4 = cdm.a($$0, $$1, $$0.et(), $$3);
      return !cdj.a($$4, $$0) && !cdj.a($$2, $$0, $$4) && !cdj.a($$0.J(), $$4) ? $$4 : null;
   }
}
