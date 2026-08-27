import javax.annotation.Nullable;

public class bqq {
   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2) {
      boolean $$3 = bqr.a($$0, $$1);
      return bqu.a($$0, () -> {
         gu $$4 = bqu.a($$0.ec(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2, eei $$3, double $$4) {
      eei $$5 = $$3.a($$0.dn(), $$0.dp(), $$0.dt());
      boolean $$6 = bqr.a($$0, $$1);
      return bqu.a($$0, () -> {
         gu $$6x = bqu.a($$0.ec(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eei a(bgi $$0, int $$1, int $$2, eei $$3) {
      eei $$4 = $$0.dg().d($$3);
      boolean $$5 = bqr.a($$0, $$1);
      return bqu.a($$0, () -> {
         gu $$5x = bqu.a($$0.ec(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gu a(bgi $$0, int $$1, boolean $$2, gu $$3) {
      gu $$4 = bqu.a($$0, $$1, $$0.ec(), $$3);
      return !bqr.a($$4, $$0) && !bqr.a($$2, $$0, $$4) && !bqr.a($$0.J(), $$4) && !bqr.b($$0, $$4) ? $$4 : null;
   }
}
