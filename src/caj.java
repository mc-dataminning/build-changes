import javax.annotation.Nullable;

public class caj {
   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2) {
      boolean $$3 = cak.a($$0, $$1);
      return can.a($$0, () -> {
         ib $$4 = can.a($$0.ei(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2, ept $$3, double $$4) {
      ept $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = cak.a($$0, $$1);
      return can.a($$0, () -> {
         ib $$6x = can.a($$0.ei(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ept a(bpx $$0, int $$1, int $$2, ept $$3) {
      ept $$4 = $$0.dk().d($$3);
      boolean $$5 = cak.a($$0, $$1);
      return can.a($$0, () -> {
         ib $$5x = can.a($$0.ei(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ib a(bpx $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = can.a($$0, $$1, $$0.ei(), $$3);
      return !cak.a($$4, $$0) && !cak.a($$2, $$0, $$4) && !cak.a($$0.K(), $$4) && !cak.b($$0, $$4) ? $$4 : null;
   }
}
