import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cfc {
   @Nullable
   public static eye a(bun $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static eye a(bun $$0, int $$1, int $$2, ToDoubleFunction<je> $$3) {
      boolean $$4 = cfa.a($$0, $$1);
      return cfd.a(() -> {
         je $$4x = cfd.a($$0.dV(), $$1, $$2);
         je $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eye a(bun $$0, int $$1, int $$2, eye $$3) {
      eye $$4 = $$3.a($$0.dx(), $$0.dz(), $$0.dD());
      boolean $$5 = cfa.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eye b(bun $$0, int $$1, int $$2, eye $$3) {
      eye $$4 = $$0.dq().d($$3);
      boolean $$5 = cfa.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eye a(bun $$0, int $$1, int $$2, eye $$3, boolean $$4) {
      return cfd.a($$0, () -> {
         je $$5 = cfd.a($$0.dV(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            je $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static je a(bun $$0, je $$1) {
      $$1 = cfd.a($$1, $$0.dS().an(), $$1x -> cfa.c($$0, $$1x));
      return !cfa.a($$0, $$1) && !cfa.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static je a(bun $$0, int $$1, boolean $$2, je $$3) {
      je $$4 = cfd.a($$0, $$1, $$0.dV(), $$3);
      return !cfa.a($$4, $$0) && !cfa.a($$2, $$0, $$4) && !cfa.a($$0.P(), $$4) ? $$4 : null;
   }
}
