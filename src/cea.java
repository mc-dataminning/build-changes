import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cea {
   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2, ToDoubleFunction<ja> $$3) {
      boolean $$4 = cdy.a($$0, $$1);
      return ceb.a(() -> {
         ja $$4x = ceb.a($$0.dU(), $$1, $$2);
         ja $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2, ewh $$3) {
      ewh $$4 = $$3.a($$0.dw(), $$0.dy(), $$0.dC());
      boolean $$5 = cdy.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ewh b(btl $$0, int $$1, int $$2, ewh $$3) {
      ewh $$4 = $$0.dp().d($$3);
      boolean $$5 = cdy.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ewh a(btl $$0, int $$1, int $$2, ewh $$3, boolean $$4) {
      return ceb.a($$0, () -> {
         ja $$5 = ceb.a($$0.dU(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ja $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ja a(btl $$0, ja $$1) {
      $$1 = ceb.a($$1, $$0.dR().am(), $$1x -> cdy.c($$0, $$1x));
      return !cdy.a($$0, $$1) && !cdy.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ja a(btl $$0, int $$1, boolean $$2, ja $$3) {
      ja $$4 = ceb.a($$0, $$1, $$0.dU(), $$3);
      return !cdy.a($$4, $$0) && !cdy.a($$2, $$0, $$4) && !cdy.a($$0.J(), $$4) ? $$4 : null;
   }
}
