import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class buf {
   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2, ToDoubleFunction<gw> $$3) {
      boolean $$4 = bud.a($$0, $$1);
      return bug.a(() -> {
         gw $$4x = bug.a($$0.ef(), $$1, $$2);
         gw $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2, ehh $$3) {
      ehh $$4 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$5 = bud.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ehh b(bjv $$0, int $$1, int $$2, ehh $$3) {
      ehh $$4 = $$0.dj().d($$3);
      boolean $$5 = bud.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ehh a(bjv $$0, int $$1, int $$2, ehh $$3, boolean $$4) {
      return bug.a($$0, () -> {
         gw $$5 = bug.a($$0.ef(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gw $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gw a(bjv $$0, gw $$1) {
      $$1 = bug.a($$1, $$0.dL().aj(), $$1x -> bud.c($$0, $$1x));
      return !bud.a($$0, $$1) && !bud.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gw a(bjv $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = bug.a($$0, $$1, $$0.ef(), $$3);
      return !bud.a($$4, $$0) && !bud.a($$2, $$0, $$4) && !bud.a($$0.L(), $$4) ? $$4 : null;
   }
}
