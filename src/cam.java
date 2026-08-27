import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cam {
   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2, ToDoubleFunction<ib> $$3) {
      boolean $$4 = cak.a($$0, $$1);
      return can.a(() -> {
         ib $$4x = can.a($$0.ei(), $$1, $$2);
         ib $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2, ept $$3) {
      ept $$4 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$5 = cak.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ept b(bpx $$0, int $$1, int $$2, ept $$3) {
      ept $$4 = $$0.dk().d($$3);
      boolean $$5 = cak.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ept a(bpx $$0, int $$1, int $$2, ept $$3, boolean $$4) {
      return can.a($$0, () -> {
         ib $$5 = can.a($$0.ei(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ib $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ib a(bpx $$0, ib $$1) {
      $$1 = can.a($$1, $$0.dM().ak(), $$1x -> cak.c($$0, $$1x));
      return !cak.a($$0, $$1) && !cak.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ib a(bpx $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = can.a($$0, $$1, $$0.ei(), $$3);
      return !cak.a($$4, $$0) && !cak.a($$2, $$0, $$4) && !cak.a($$0.K(), $$4) ? $$4 : null;
   }
}
