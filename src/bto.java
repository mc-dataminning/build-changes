import javax.annotation.Nullable;

public class bto {
   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2) {
      boolean $$3 = btp.a($$0, $$1);
      return bts.a($$0, () -> {
         gu $$4 = bts.a($$0.ee(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2, ehd $$3, double $$4) {
      ehd $$5 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$6 = btp.a($$0, $$1);
      return bts.a($$0, () -> {
         gu $$6x = bts.a($$0.ee(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2, ehd $$3) {
      ehd $$4 = $$0.di().d($$3);
      boolean $$5 = btp.a($$0, $$1);
      return bts.a($$0, () -> {
         gu $$5x = bts.a($$0.ee(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gu a(bjh $$0, int $$1, boolean $$2, gu $$3) {
      gu $$4 = bts.a($$0, $$1, $$0.ee(), $$3);
      return !btp.a($$4, $$0) && !btp.a($$2, $$0, $$4) && !btp.a($$0.H(), $$4) && !btp.b($$0, $$4) ? $$4 : null;
   }
}
