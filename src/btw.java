import javax.annotation.Nullable;

public class btw {
   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2) {
      boolean $$3 = btx.a($$0, $$1);
      return bua.a($$0, () -> {
         gw $$4 = bua.a($$0.ef(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2, ehn $$3, double $$4) {
      ehn $$5 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$6 = btx.a($$0, $$1);
      return bua.a($$0, () -> {
         gw $$6x = bua.a($$0.ef(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ehn a(bjp $$0, int $$1, int $$2, ehn $$3) {
      ehn $$4 = $$0.dj().d($$3);
      boolean $$5 = btx.a($$0, $$1);
      return bua.a($$0, () -> {
         gw $$5x = bua.a($$0.ef(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gw a(bjp $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = bua.a($$0, $$1, $$0.ef(), $$3);
      return !btx.a($$4, $$0) && !btx.a($$2, $$0, $$4) && !btx.a($$0.L(), $$4) && !btx.b($$0, $$4) ? $$4 : null;
   }
}
