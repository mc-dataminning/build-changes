import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bvz {
   @Nullable
   public static eju a(blp $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static eju a(blp $$0, int $$1, int $$2, ToDoubleFunction<ht> $$3) {
      boolean $$4 = bvx.a($$0, $$1);
      return bwa.a(() -> {
         ht $$4x = bwa.a($$0.eh(), $$1, $$2);
         ht $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eju a(blp $$0, int $$1, int $$2, eju $$3) {
      eju $$4 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$5 = bvx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eju b(blp $$0, int $$1, int $$2, eju $$3) {
      eju $$4 = $$0.dl().d($$3);
      boolean $$5 = bvx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eju a(blp $$0, int $$1, int $$2, eju $$3, boolean $$4) {
      return bwa.a($$0, () -> {
         ht $$5 = bwa.a($$0.eh(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ht $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ht a(blp $$0, ht $$1) {
      $$1 = bwa.a($$1, $$0.dN().ak(), $$1x -> bvx.c($$0, $$1x));
      return !bvx.a($$0, $$1) && !bvx.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ht a(blp $$0, int $$1, boolean $$2, ht $$3) {
      ht $$4 = bwa.a($$0, $$1, $$0.eh(), $$3);
      return !bvx.a($$4, $$0) && !bvx.a($$2, $$0, $$4) && !bvx.a($$0.N(), $$4) ? $$4 : null;
   }
}
