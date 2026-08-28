import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cdw {
   @Nullable
   public static evz a(bth $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static evz a(bth $$0, int $$1, int $$2, ToDoubleFunction<ja> $$3) {
      boolean $$4 = cdu.a($$0, $$1);
      return cdx.a(() -> {
         ja $$4x = cdx.a($$0.dS(), $$1, $$2);
         ja $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static evz a(bth $$0, int $$1, int $$2, evz $$3) {
      evz $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = cdu.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static evz b(bth $$0, int $$1, int $$2, evz $$3) {
      evz $$4 = $$0.dn().d($$3);
      boolean $$5 = cdu.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static evz a(bth $$0, int $$1, int $$2, evz $$3, boolean $$4) {
      return cdx.a($$0, () -> {
         ja $$5 = cdx.a($$0.dS(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ja $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ja a(bth $$0, ja $$1) {
      $$1 = cdx.a($$1, $$0.dP().am(), $$1x -> cdu.c($$0, $$1x));
      return !cdu.a($$0, $$1) && !cdu.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ja a(bth $$0, int $$1, boolean $$2, ja $$3) {
      ja $$4 = cdx.a($$0, $$1, $$0.dS(), $$3);
      return !cdu.a($$4, $$0) && !cdu.a($$2, $$0, $$4) && !cdu.a($$0.K(), $$4) ? $$4 : null;
   }
}
