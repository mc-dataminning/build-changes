import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cgf {
   @Nullable
   public static ezy a(bvp $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ezy a(bvp $$0, int $$1, int $$2, ToDoubleFunction<jh> $$3) {
      boolean $$4 = cgd.a($$0, $$1);
      return cgg.a(() -> {
         jh $$4x = cgg.a($$0.dY(), $$1, $$2);
         jh $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ezy a(bvp $$0, int $$1, int $$2, ezy $$3) {
      ezy $$4 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$5 = cgd.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ezy b(bvp $$0, int $$1, int $$2, ezy $$3) {
      ezy $$4 = $$0.dt().d($$3);
      boolean $$5 = cgd.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ezy a(bvp $$0, int $$1, int $$2, ezy $$3, boolean $$4) {
      return cgg.a($$0, () -> {
         jh $$5 = cgg.a($$0.dY(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jh $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jh a(bvp $$0, jh $$1) {
      $$1 = cgg.a($$1, $$0.dV().al(), $$1x -> cgd.c($$0, $$1x));
      return !cgd.a($$0, $$1) && !cgd.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jh a(bvp $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cgg.a($$0, $$1, $$0.dY(), $$3);
      return !cgd.a($$4, $$0) && !cgd.a($$2, $$0, $$4) && !cgd.a($$0.L(), $$4) ? $$4 : null;
   }
}
