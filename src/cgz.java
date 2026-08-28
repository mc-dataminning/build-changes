import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cgz {
   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2, ToDoubleFunction<jh> $$3) {
      boolean $$4 = cgx.a($$0, $$1);
      return cha.a(() -> {
         jh $$4x = cha.a($$0.dY(), $$1, $$2);
         jh $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2, fbs $$3) {
      fbs $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = cgx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fbs b(bwj $$0, int $$1, int $$2, fbs $$3) {
      fbs $$4 = $$0.dt().d($$3);
      boolean $$5 = cgx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fbs a(bwj $$0, int $$1, int $$2, fbs $$3, boolean $$4) {
      return cha.a($$0, () -> {
         jh $$5 = cha.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jh $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jh a(bwj $$0, jh $$1) {
      $$1 = cha.a($$1, $$0.dV().am(), $$1x -> cgx.c($$0, $$1x));
      return !cgx.a($$0, $$1) && !cgx.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jh a(bwj $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cha.a($$0, $$1, $$0.dY(), $$3);
      return !cgx.a($$4, $$0) && !cgx.a($$2, $$0, $$4) && !cgx.a($$0.L(), $$4) ? $$4 : null;
   }
}
