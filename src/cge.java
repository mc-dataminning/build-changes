import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cge {
   @Nullable
   public static fba a(bvo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fba a(bvo $$0, int $$1, int $$2, ToDoubleFunction<ji> $$3) {
      boolean $$4 = cgc.a($$0, $$1);
      return cgf.a(() -> {
         ji $$4x = cgf.a($$0.dZ(), $$1, $$2);
         ji $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fba a(bvo $$0, int $$1, int $$2, fba $$3) {
      fba $$4 = $$3.a($$0.dB(), $$0.dD(), $$0.dH());
      boolean $$5 = cgc.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fba b(bvo $$0, int $$1, int $$2, fba $$3) {
      fba $$4 = $$0.du().d($$3);
      boolean $$5 = cgc.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fba a(bvo $$0, int $$1, int $$2, fba $$3, boolean $$4) {
      return cgf.a($$0, () -> {
         ji $$5 = cgf.a($$0.dZ(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ji $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ji a(bvo $$0, ji $$1) {
      $$1 = cgf.a($$1, $$0.dW().an(), $$1x -> cgc.c($$0, $$1x));
      return !cgc.a($$0, $$1) && !cgc.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ji a(bvo $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cgf.a($$0, $$1, $$0.dZ(), $$3);
      return !cgc.a($$4, $$0) && !cgc.a($$2, $$0, $$4) && !cgc.a($$0.L(), $$4) ? $$4 : null;
   }
}
