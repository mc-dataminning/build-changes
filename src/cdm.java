import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cdm {
   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::d);
   }

   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2, ToDoubleFunction<io> $$3) {
      boolean $$4 = cdk.a($$0, $$1);
      return cdn.a(() -> {
         io $$4x = cdn.a($$0.el(), $$1, $$2);
         io $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2, euk $$3) {
      euk $$4 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$5 = cdk.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static euk b(bsx $$0, int $$1, int $$2, euk $$3) {
      euk $$4 = $$0.dn().d($$3);
      boolean $$5 = cdk.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static euk a(bsx $$0, int $$1, int $$2, euk $$3, boolean $$4) {
      return cdn.a($$0, () -> {
         io $$5 = cdn.a($$0.el(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            io $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static io a(bsx $$0, io $$1) {
      $$1 = cdn.a($$1, $$0.dP().al(), $$1x -> cdk.c($$0, $$1x));
      return !cdk.a($$0, $$1) && !cdk.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static io a(bsx $$0, int $$1, boolean $$2, io $$3) {
      io $$4 = cdn.a($$0, $$1, $$0.el(), $$3);
      return !cdk.a($$4, $$0) && !cdk.a($$2, $$0, $$4) && !cdk.a($$0.K(), $$4) ? $$4 : null;
   }
}
