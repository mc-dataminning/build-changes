import javax.annotation.Nullable;

public class btp {
   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2) {
      boolean $$3 = btq.a($$0, $$1);
      return btt.a($$0, () -> {
         gu $$4 = btt.a($$0.ee(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2, ehe $$3, double $$4) {
      ehe $$5 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$6 = btq.a($$0, $$1);
      return btt.a($$0, () -> {
         gu $$6x = btt.a($$0.ee(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2, ehe $$3) {
      ehe $$4 = $$0.di().d($$3);
      boolean $$5 = btq.a($$0, $$1);
      return btt.a($$0, () -> {
         gu $$5x = btt.a($$0.ee(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gu a(bjh $$0, int $$1, boolean $$2, gu $$3) {
      gu $$4 = btt.a($$0, $$1, $$0.ee(), $$3);
      return !btq.a($$4, $$0) && !btq.a($$2, $$0, $$4) && !btq.a($$0.H(), $$4) && !btq.b($$0, $$4) ? $$4 : null;
   }
}
