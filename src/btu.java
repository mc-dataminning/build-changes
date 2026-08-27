import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class btu {
   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2, ToDoubleFunction<gw> $$3) {
      boolean $$4 = bts.a($$0, $$1);
      return btv.a(() -> {
         gw $$4x = btv.a($$0.ee(), $$1, $$2);
         gw $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2, ehi $$3) {
      ehi $$4 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$5 = bts.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ehi b(bjk $$0, int $$1, int $$2, ehi $$3) {
      ehi $$4 = $$0.di().d($$3);
      boolean $$5 = bts.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ehi a(bjk $$0, int $$1, int $$2, ehi $$3, boolean $$4) {
      return btv.a($$0, () -> {
         gw $$5 = btv.a($$0.ee(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gw $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gw a(bjk $$0, gw $$1) {
      $$1 = btv.a($$1, $$0.dK().aj(), $$1x -> bts.c($$0, $$1x));
      return !bts.a($$0, $$1) && !bts.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gw a(bjk $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = btv.a($$0, $$1, $$0.ee(), $$3);
      return !bts.a($$4, $$0) && !bts.a($$2, $$0, $$4) && !bts.a($$0.H(), $$4) ? $$4 : null;
   }
}
