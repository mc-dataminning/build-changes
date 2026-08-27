import javax.annotation.Nullable;

public class cbi {
   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2) {
      boolean $$3 = cbj.a($$0, $$1);
      return cbm.a($$0, () -> {
         ib $$4 = cbm.a($$0.ei(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2, esa $$3, double $$4) {
      esa $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = cbj.a($$0, $$1);
      return cbm.a($$0, () -> {
         ib $$6x = cbm.a($$0.ei(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2, esa $$3) {
      esa $$4 = $$0.dk().d($$3);
      boolean $$5 = cbj.a($$0, $$1);
      return cbm.a($$0, () -> {
         ib $$5x = cbm.a($$0.ei(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ib a(bqw $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = cbm.a($$0, $$1, $$0.ei(), $$3);
      return !cbj.a($$4, $$0) && !cbj.a($$2, $$0, $$4) && !cbj.a($$0.K(), $$4) && !cbj.b($$0, $$4) ? $$4 : null;
   }
}
