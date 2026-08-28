import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cgv {
   @Nullable
   public static fbr a(bwf $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fbr a(bwf $$0, int $$1, int $$2, ToDoubleFunction<jh> $$3) {
      boolean $$4 = cgt.a($$0, $$1);
      return cgw.a(() -> {
         jh $$4x = cgw.a($$0.dZ(), $$1, $$2);
         jh $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fbr a(bwf $$0, int $$1, int $$2, fbr $$3) {
      fbr $$4 = $$3.a($$0.dB(), $$0.dD(), $$0.dH());
      boolean $$5 = cgt.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fbr b(bwf $$0, int $$1, int $$2, fbr $$3) {
      fbr $$4 = $$0.du().d($$3);
      boolean $$5 = cgt.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fbr a(bwf $$0, int $$1, int $$2, fbr $$3, boolean $$4) {
      return cgw.a($$0, () -> {
         jh $$5 = cgw.a($$0.dZ(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jh $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jh a(bwf $$0, jh $$1) {
      $$1 = cgw.a($$1, $$0.dW().an(), $$1x -> cgt.c($$0, $$1x));
      return !cgt.a($$0, $$1) && !cgt.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jh a(bwf $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cgw.a($$0, $$1, $$0.dZ(), $$3);
      return !cgt.a($$4, $$0) && !cgt.a($$2, $$0, $$4) && !cgt.a($$0.L(), $$4) ? $$4 : null;
   }
}
