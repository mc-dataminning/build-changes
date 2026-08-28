import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class chy {
   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2, ToDoubleFunction<iu> $$3) {
      boolean $$4 = chw.a($$0, $$1);
      return chz.a(() -> {
         iu $$4x = chz.a($$0.dY(), $$1, $$2);
         iu $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2, fei $$3) {
      fei $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = chw.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fei b(bxk $$0, int $$1, int $$2, fei $$3) {
      fei $$4 = $$0.dt().d($$3);
      boolean $$5 = chw.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fei a(bxk $$0, int $$1, int $$2, fei $$3, boolean $$4) {
      return chz.a($$0, () -> {
         iu $$5 = chz.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iu $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iu a(bxk $$0, iu $$1) {
      $$1 = chz.a($$1, $$0.dV().ao(), $$1x -> chw.c($$0, $$1x));
      return !chw.a($$0, $$1) && !chw.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iu a(bxk $$0, int $$1, boolean $$2, iu $$3) {
      iu $$4 = chz.a($$0, $$1, $$0.dY(), $$3);
      return !chw.a($$4, $$0) && !chw.a($$2, $$0, $$4) && !chw.a($$0.O(), $$4) ? $$4 : null;
   }
}
