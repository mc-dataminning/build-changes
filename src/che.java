import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class che {
   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2, ToDoubleFunction<jh> $$3) {
      boolean $$4 = chc.a($$0, $$1);
      return chf.a(() -> {
         jh $$4x = chf.a($$0.dZ(), $$1, $$2);
         jh $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fby a(bwo $$0, int $$1, int $$2, fby $$3) {
      fby $$4 = $$3.a($$0.dB(), $$0.dD(), $$0.dH());
      boolean $$5 = chc.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fby b(bwo $$0, int $$1, int $$2, fby $$3) {
      fby $$4 = $$0.du().d($$3);
      boolean $$5 = chc.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fby a(bwo $$0, int $$1, int $$2, fby $$3, boolean $$4) {
      return chf.a($$0, () -> {
         jh $$5 = chf.a($$0.dZ(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jh $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jh a(bwo $$0, jh $$1) {
      $$1 = chf.a($$1, $$0.dW().am(), $$1x -> chc.c($$0, $$1x));
      return !chc.a($$0, $$1) && !chc.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jh a(bwo $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = chf.a($$0, $$1, $$0.dZ(), $$3);
      return !chc.a($$4, $$0) && !chc.a($$2, $$0, $$4) && !chc.a($$0.L(), $$4) ? $$4 : null;
   }
}
