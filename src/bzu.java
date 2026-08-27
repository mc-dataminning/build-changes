import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bzu {
   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2, ToDoubleFunction<ib> $$3) {
      boolean $$4 = bzs.a($$0, $$1);
      return bzv.a(() -> {
         ib $$4x = bzv.a($$0.ef(), $$1, $$2);
         ib $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static eov a(bpf $$0, int $$1, int $$2, eov $$3) {
      eov $$4 = $$3.a($$0.do(), $$0.dq(), $$0.du());
      boolean $$5 = bzs.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static eov b(bpf $$0, int $$1, int $$2, eov $$3) {
      eov $$4 = $$0.dh().d($$3);
      boolean $$5 = bzs.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static eov a(bpf $$0, int $$1, int $$2, eov $$3, boolean $$4) {
      return bzv.a($$0, () -> {
         ib $$5 = bzv.a($$0.ef(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ib $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ib a(bpf $$0, ib $$1) {
      $$1 = bzv.a($$1, $$0.dJ().ak(), $$1x -> bzs.c($$0, $$1x));
      return !bzs.a($$0, $$1) && !bzs.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ib a(bpf $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = bzv.a($$0, $$1, $$0.ef(), $$3);
      return !bzs.a($$4, $$0) && !bzs.a($$2, $$0, $$4) && !bzs.a($$0.N(), $$4) ? $$4 : null;
   }
}
