import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cfh {
   @Nullable
   public static eys a(bus $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static eys a(bus $$0, int $$1, int $$2, ToDoubleFunction<je> $$3) {
      boolean $$4 = cff.a($$0, $$1);
      return cfi.a(() -> {
         je $$4x = cfi.a($$0.dV(), $$1, $$2);
         je $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eys a(bus $$0, int $$1, int $$2, eys $$3) {
      eys $$4 = $$3.a($$0.dx(), $$0.dz(), $$0.dD());
      boolean $$5 = cff.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eys b(bus $$0, int $$1, int $$2, eys $$3) {
      eys $$4 = $$0.dq().d($$3);
      boolean $$5 = cff.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eys a(bus $$0, int $$1, int $$2, eys $$3, boolean $$4) {
      return cfi.a($$0, () -> {
         je $$5 = cfi.a($$0.dV(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            je $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static je a(bus $$0, je $$1) {
      $$1 = cfi.a($$1, $$0.dS().an(), $$1x -> cff.c($$0, $$1x));
      return !cff.a($$0, $$1) && !cff.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static je a(bus $$0, int $$1, boolean $$2, je $$3) {
      je $$4 = cfi.a($$0, $$1, $$0.dV(), $$3);
      return !cff.a($$4, $$0) && !cff.a($$2, $$0, $$4) && !cff.a($$0.P(), $$4) ? $$4 : null;
   }
}
