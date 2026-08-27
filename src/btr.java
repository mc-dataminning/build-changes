import javax.annotation.Nullable;

public class btr {
   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2) {
      boolean $$3 = bts.a($$0, $$1);
      return btv.a($$0, () -> {
         gw $$4 = btv.a($$0.ee(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2, ehi $$3, double $$4) {
      ehi $$5 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$6 = bts.a($$0, $$1);
      return btv.a($$0, () -> {
         gw $$6x = btv.a($$0.ee(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ehi a(bjk $$0, int $$1, int $$2, ehi $$3) {
      ehi $$4 = $$0.di().d($$3);
      boolean $$5 = bts.a($$0, $$1);
      return btv.a($$0, () -> {
         gw $$5x = btv.a($$0.ee(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gw a(bjk $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = btv.a($$0, $$1, $$0.ee(), $$3);
      return !bts.a($$4, $$0) && !bts.a($$2, $$0, $$4) && !bts.a($$0.H(), $$4) && !bts.b($$0, $$4) ? $$4 : null;
   }
}
