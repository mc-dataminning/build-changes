import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class ccx {
   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2, ToDoubleFunction<in> $$3) {
      boolean $$4 = ccv.a($$0, $$1);
      return ccy.a(() -> {
         in $$4x = ccy.a($$0.ej(), $$1, $$2);
         in $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static etp a(bsi $$0, int $$1, int $$2, etp $$3) {
      etp $$4 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$5 = ccv.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static etp b(bsi $$0, int $$1, int $$2, etp $$3) {
      etp $$4 = $$0.dl().d($$3);
      boolean $$5 = ccv.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static etp a(bsi $$0, int $$1, int $$2, etp $$3, boolean $$4) {
      return ccy.a($$0, () -> {
         in $$5 = ccy.a($$0.ej(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            in $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static in a(bsi $$0, in $$1) {
      $$1 = ccy.a($$1, $$0.dN().al(), $$1x -> ccv.c($$0, $$1x));
      return !ccv.a($$0, $$1) && !ccv.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static in a(bsi $$0, int $$1, boolean $$2, in $$3) {
      in $$4 = ccy.a($$0, $$1, $$0.ej(), $$3);
      return !ccv.a($$4, $$0) && !ccv.a($$2, $$0, $$4) && !ccv.a($$0.K(), $$4) ? $$4 : null;
   }
}
