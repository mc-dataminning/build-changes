import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cgd {
   @Nullable
   public static fay a(bvn $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fay a(bvn $$0, int $$1, int $$2, ToDoubleFunction<ji> $$3) {
      boolean $$4 = cgb.a($$0, $$1);
      return cge.a(() -> {
         ji $$4x = cge.a($$0.dZ(), $$1, $$2);
         ji $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fay a(bvn $$0, int $$1, int $$2, fay $$3) {
      fay $$4 = $$3.a($$0.dB(), $$0.dD(), $$0.dH());
      boolean $$5 = cgb.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fay b(bvn $$0, int $$1, int $$2, fay $$3) {
      fay $$4 = $$0.du().d($$3);
      boolean $$5 = cgb.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fay a(bvn $$0, int $$1, int $$2, fay $$3, boolean $$4) {
      return cge.a($$0, () -> {
         ji $$5 = cge.a($$0.dZ(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ji $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ji a(bvn $$0, ji $$1) {
      $$1 = cge.a($$1, $$0.dW().an(), $$1x -> cgb.c($$0, $$1x));
      return !cgb.a($$0, $$1) && !cgb.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ji a(bvn $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cge.a($$0, $$1, $$0.dZ(), $$3);
      return !cgb.a($$4, $$0) && !cgb.a($$2, $$0, $$4) && !cgb.a($$0.L(), $$4) ? $$4 : null;
   }
}
