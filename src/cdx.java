import javax.annotation.Nullable;

public class cdx {
   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2) {
      boolean $$3 = cdy.a($$0, $$1);
      return ceb.a($$0, () -> {
         ja $$4 = ceb.a($$0.dU(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2, ewh $$3, double $$4) {
      ewh $$5 = $$3.a($$0.dw(), $$0.dy(), $$0.dC());
      boolean $$6 = cdy.a($$0, $$1);
      return ceb.a($$0, () -> {
         ja $$6x = ceb.a($$0.dU(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2, ewh $$3) {
      ewh $$4 = $$0.dp().d($$3);
      boolean $$5 = cdy.a($$0, $$1);
      return ceb.a($$0, () -> {
         ja $$5x = ceb.a($$0.dU(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ja a(btl $$0, int $$1, boolean $$2, ja $$3) {
      ja $$4 = ceb.a($$0, $$1, $$0.dU(), $$3);
      return !cdy.a($$4, $$0) && !cdy.a($$2, $$0, $$4) && !cdy.a($$0.J(), $$4) && !cdy.b($$0, $$4) ? $$4 : null;
   }
}
