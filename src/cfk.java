import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cfk {
   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2, ToDoubleFunction<jf> $$3) {
      boolean $$4 = cfi.a($$0, $$1);
      return cfl.a(() -> {
         jf $$4x = cfl.a($$0.dV(), $$1, $$2);
         jf $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eyw a(buv $$0, int $$1, int $$2, eyw $$3) {
      eyw $$4 = $$3.a($$0.dx(), $$0.dz(), $$0.dD());
      boolean $$5 = cfi.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eyw b(buv $$0, int $$1, int $$2, eyw $$3) {
      eyw $$4 = $$0.dq().d($$3);
      boolean $$5 = cfi.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eyw a(buv $$0, int $$1, int $$2, eyw $$3, boolean $$4) {
      return cfl.a($$0, () -> {
         jf $$5 = cfl.a($$0.dV(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jf $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jf a(buv $$0, jf $$1) {
      $$1 = cfl.a($$1, $$0.dS().an(), $$1x -> cfi.c($$0, $$1x));
      return !cfi.a($$0, $$1) && !cfi.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jf a(buv $$0, int $$1, boolean $$2, jf $$3) {
      jf $$4 = cfl.a($$0, $$1, $$0.dV(), $$3);
      return !cfi.a($$4, $$0) && !cfi.a($$2, $$0, $$4) && !cfi.a($$0.P(), $$4) ? $$4 : null;
   }
}
