import javax.annotation.Nullable;

public class bxc {
   @Nullable
   public static els a(bmt $$0, int $$1, int $$2) {
      boolean $$3 = bxd.a($$0, $$1);
      return bxg.a($$0, () -> {
         hx $$4 = bxg.a($$0.eg(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static els a(bmt $$0, int $$1, int $$2, els $$3, double $$4) {
      els $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = bxd.a($$0, $$1);
      return bxg.a($$0, () -> {
         hx $$6x = bxg.a($$0.eg(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static els a(bmt $$0, int $$1, int $$2, els $$3) {
      els $$4 = $$0.dk().d($$3);
      boolean $$5 = bxd.a($$0, $$1);
      return bxg.a($$0, () -> {
         hx $$5x = bxg.a($$0.eg(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static hx a(bmt $$0, int $$1, boolean $$2, hx $$3) {
      hx $$4 = bxg.a($$0, $$1, $$0.eg(), $$3);
      return !bxd.a($$4, $$0) && !bxd.a($$2, $$0, $$4) && !bxd.a($$0.N(), $$4) && !bxd.b($$0, $$4) ? $$4 : null;
   }
}
