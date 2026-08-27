import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class btz {
   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2, ToDoubleFunction<gw> $$3) {
      boolean $$4 = btx.a($$0, $$1);
      return bua.a(() -> {
         gw $$4x = bua.a($$0.ef(), $$1, $$2);
         gw $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2, ehn $$3) {
      ehn $$4 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$5 = btx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ehn b(bjp $$0, int $$1, int $$2, ehn $$3) {
      ehn $$4 = $$0.dj().d($$3);
      boolean $$5 = btx.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ehn a(bjp $$0, int $$1, int $$2, ehn $$3, boolean $$4) {
      return bua.a($$0, () -> {
         gw $$5 = bua.a($$0.ef(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gw $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gw a(bjp $$0, gw $$1) {
      $$1 = bua.a($$1, $$0.dL().aj(), $$1x -> btx.c($$0, $$1x));
      return !btx.a($$0, $$1) && !btx.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gw a(bjp $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = bua.a($$0, $$1, $$0.ef(), $$3);
      return !btx.a($$4, $$0) && !btx.a($$2, $$0, $$4) && !btx.a($$0.L(), $$4) ? $$4 : null;
   }
}
