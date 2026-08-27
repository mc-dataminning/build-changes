import javax.annotation.Nullable;

public class cai {
   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2) {
      boolean $$3 = caj.a($$0, $$1);
      return cam.a($$0, () -> {
         ib $$4 = cam.a($$0.ei(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2, epr $$3, double $$4) {
      epr $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = caj.a($$0, $$1);
      return cam.a($$0, () -> {
         ib $$6x = cam.a($$0.ei(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2, epr $$3) {
      epr $$4 = $$0.dk().d($$3);
      boolean $$5 = caj.a($$0, $$1);
      return cam.a($$0, () -> {
         ib $$5x = cam.a($$0.ei(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ib a(bpw $$0, int $$1, boolean $$2, ib $$3) {
      ib $$4 = cam.a($$0, $$1, $$0.ei(), $$3);
      return !caj.a($$4, $$0) && !caj.a($$2, $$0, $$4) && !caj.a($$0.K(), $$4) && !caj.b($$0, $$4) ? $$4 : null;
   }
}
