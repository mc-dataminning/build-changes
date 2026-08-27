import javax.annotation.Nullable;

public class bxh {
   @Nullable
   public static emc a(bmx $$0, int $$1, int $$2) {
      boolean $$3 = bxi.a($$0, $$1);
      return bxl.a($$0, () -> {
         hx $$4 = bxl.a($$0.eg(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static emc a(bmx $$0, int $$1, int $$2, emc $$3, double $$4) {
      emc $$5 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$6 = bxi.a($$0, $$1);
      return bxl.a($$0, () -> {
         hx $$6x = bxl.a($$0.eg(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static emc a(bmx $$0, int $$1, int $$2, emc $$3) {
      emc $$4 = $$0.dj().d($$3);
      boolean $$5 = bxi.a($$0, $$1);
      return bxl.a($$0, () -> {
         hx $$5x = bxl.a($$0.eg(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static hx a(bmx $$0, int $$1, boolean $$2, hx $$3) {
      hx $$4 = bxl.a($$0, $$1, $$0.eg(), $$3);
      return !bxi.a($$4, $$0) && !bxi.a($$2, $$0, $$4) && !bxi.a($$0.N(), $$4) && !bxi.b($$0, $$4) ? $$4 : null;
   }
}
