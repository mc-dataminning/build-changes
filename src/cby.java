import javax.annotation.Nullable;

public class cby {
   @Nullable
   public static etf a(brm $$0, int $$1, int $$2) {
      boolean $$3 = cbz.a($$0, $$1);
      return ccc.a($$0, () -> {
         im $$4 = ccc.a($$0.ej(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static etf a(brm $$0, int $$1, int $$2, etf $$3, double $$4) {
      etf $$5 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$6 = cbz.a($$0, $$1);
      return ccc.a($$0, () -> {
         im $$6x = ccc.a($$0.ej(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static etf a(brm $$0, int $$1, int $$2, etf $$3) {
      etf $$4 = $$0.dl().d($$3);
      boolean $$5 = cbz.a($$0, $$1);
      return ccc.a($$0, () -> {
         im $$5x = ccc.a($$0.ej(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static im a(brm $$0, int $$1, boolean $$2, im $$3) {
      im $$4 = ccc.a($$0, $$1, $$0.ej(), $$3);
      return !cbz.a($$4, $$0) && !cbz.a($$2, $$0, $$4) && !cbz.a($$0.K(), $$4) && !cbz.b($$0, $$4) ? $$4 : null;
   }
}
