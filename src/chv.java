import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class chv {
   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2, ToDoubleFunction<iu> $$3) {
      boolean $$4 = cht.a($$0, $$1);
      return chw.a(() -> {
         iu $$4x = chw.a($$0.dY(), $$1, $$2);
         iu $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2, fdw $$3) {
      fdw $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = cht.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fdw b(bxh $$0, int $$1, int $$2, fdw $$3) {
      fdw $$4 = $$0.dt().d($$3);
      boolean $$5 = cht.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fdw a(bxh $$0, int $$1, int $$2, fdw $$3, boolean $$4) {
      return chw.a($$0, () -> {
         iu $$5 = chw.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            iu $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static iu a(bxh $$0, iu $$1) {
      $$1 = chw.a($$1, $$0.dV().ao(), $$1x -> cht.c($$0, $$1x));
      return !cht.a($$0, $$1) && !cht.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static iu a(bxh $$0, int $$1, boolean $$2, iu $$3) {
      iu $$4 = chw.a($$0, $$1, $$0.dY(), $$3);
      return !cht.a($$4, $$0) && !cht.a($$2, $$0, $$4) && !cht.a($$0.O(), $$4) ? $$4 : null;
   }
}
