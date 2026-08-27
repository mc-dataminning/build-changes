import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bub {
   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2, ToDoubleFunction<gw> $$3) {
      boolean $$4 = btz.a($$0, $$1);
      return buc.a(() -> {
         gw $$4x = buc.a($$0.ef(), $$1, $$2);
         gw $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2, ehp $$3) {
      ehp $$4 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$5 = btz.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ehp b(bjr $$0, int $$1, int $$2, ehp $$3) {
      ehp $$4 = $$0.dj().d($$3);
      boolean $$5 = btz.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ehp a(bjr $$0, int $$1, int $$2, ehp $$3, boolean $$4) {
      return buc.a($$0, () -> {
         gw $$5 = buc.a($$0.ef(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gw $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gw a(bjr $$0, gw $$1) {
      $$1 = buc.a($$1, $$0.dL().aj(), $$1x -> btz.c($$0, $$1x));
      return !btz.a($$0, $$1) && !btz.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gw a(bjr $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = buc.a($$0, $$1, $$0.ef(), $$3);
      return !btz.a($$4, $$0) && !btz.a($$2, $$0, $$4) && !btz.a($$0.L(), $$4) ? $$4 : null;
   }
}
