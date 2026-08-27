import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cal {
   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2, ToDoubleFunction<ib> $$3) {
      boolean $$4 = caj.a($$0, $$1);
      return cam.a(() -> {
         ib $$4x = cam.a($$0.ei(), $$1, $$2);
         ib $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2, epr $$3) {
      epr $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = caj.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static epr b(bpw $$0, int $$1, int $$2, epr $$3) {
      epr $$4 = $$0.dk().d($$3);
      boolean $$5 = caj.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static epr a(bpw $$0, int $$1, int $$2, epr $$3, boolean $$4) {
      return cam.a($$0, () -> {
         ib $$5 = cam.a($$0.ei(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ib $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ib a(bpw $$0, ib $$1) {
      $$1 = cam.a($$1, $$0.dM().ak(), $$1x -> caj.c($$0, $$1x));
      return !caj.a($$0, $$1) && !caj.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ib a(bpw $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = cam.a($$0, $$1, $$0.ei(), $$3);
      return !caj.a($$4, $$0) && !caj.a($$2, $$0, $$4) && !caj.a($$0.K(), $$4) ? $$4 : null;
   }
}
