import javax.annotation.Nullable;

public class bty {
   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2) {
      boolean $$3 = btz.a($$0, $$1);
      return buc.a($$0, () -> {
         gw $$4 = buc.a($$0.ef(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2, ehp $$3, double $$4) {
      ehp $$5 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$6 = btz.a($$0, $$1);
      return buc.a($$0, () -> {
         gw $$6x = buc.a($$0.ef(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2, ehp $$3) {
      ehp $$4 = $$0.dj().d($$3);
      boolean $$5 = btz.a($$0, $$1);
      return buc.a($$0, () -> {
         gw $$5x = buc.a($$0.ef(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gw a(bjr $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = buc.a($$0, $$1, $$0.ef(), $$3);
      return !btz.a($$4, $$0) && !btz.a($$2, $$0, $$4) && !btz.a($$0.L(), $$4) && !btz.b($$0, $$4) ? $$4 : null;
   }
}
