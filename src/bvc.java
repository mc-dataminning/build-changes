import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bvc {
   @Nullable
   public static eif a(bks $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static eif a(bks $$0, int $$1, int $$2, ToDoubleFunction<ht> $$3) {
      boolean $$4 = bva.a($$0, $$1);
      return bvd.a(() -> {
         ht $$4x = bvd.a($$0.ef(), $$1, $$2);
         ht $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eif a(bks $$0, int $$1, int $$2, eif $$3) {
      eif $$4 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$5 = bva.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eif b(bks $$0, int $$1, int $$2, eif $$3) {
      eif $$4 = $$0.dj().d($$3);
      boolean $$5 = bva.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eif a(bks $$0, int $$1, int $$2, eif $$3, boolean $$4) {
      return bvd.a($$0, () -> {
         ht $$5 = bvd.a($$0.ef(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ht $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ht a(bks $$0, ht $$1) {
      $$1 = bvd.a($$1, $$0.dL().aj(), $$1x -> bva.c($$0, $$1x));
      return !bva.a($$0, $$1) && !bva.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ht a(bks $$0, int $$1, boolean $$2, ht $$3) {
      ht $$4 = bvd.a($$0, $$1, $$0.ef(), $$3);
      return !bva.a($$4, $$0) && !bva.a($$2, $$0, $$4) && !bva.a($$0.L(), $$4) ? $$4 : null;
   }
}
