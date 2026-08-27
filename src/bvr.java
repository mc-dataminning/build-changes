import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bvr {
   @Nullable
   public static eji a(blh $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static eji a(blh $$0, int $$1, int $$2, ToDoubleFunction<ht> $$3) {
      boolean $$4 = bvp.a($$0, $$1);
      return bvs.a(() -> {
         ht $$4x = bvs.a($$0.ef(), $$1, $$2);
         ht $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eji a(blh $$0, int $$1, int $$2, eji $$3) {
      eji $$4 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$5 = bvp.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eji b(blh $$0, int $$1, int $$2, eji $$3) {
      eji $$4 = $$0.dj().d($$3);
      boolean $$5 = bvp.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eji a(blh $$0, int $$1, int $$2, eji $$3, boolean $$4) {
      return bvs.a($$0, () -> {
         ht $$5 = bvs.a($$0.ef(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ht $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ht a(blh $$0, ht $$1) {
      $$1 = bvs.a($$1, $$0.dL().aj(), $$1x -> bvp.c($$0, $$1x));
      return !bvp.a($$0, $$1) && !bvp.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ht a(blh $$0, int $$1, boolean $$2, ht $$3) {
      ht $$4 = bvs.a($$0, $$1, $$0.ef(), $$3);
      return !bvp.a($$4, $$0) && !bvp.a($$2, $$0, $$4) && !bvp.a($$0.L(), $$4) ? $$4 : null;
   }
}
