import javax.annotation.Nullable;

public class bvo {
   @Nullable
   public static eji a(blh $$0, int $$1, int $$2) {
      boolean $$3 = bvp.a($$0, $$1);
      return bvs.a($$0, () -> {
         ht $$4 = bvs.a($$0.ef(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eji a(blh $$0, int $$1, int $$2, eji $$3, double $$4) {
      eji $$5 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$6 = bvp.a($$0, $$1);
      return bvs.a($$0, () -> {
         ht $$6x = bvs.a($$0.ef(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eji a(blh $$0, int $$1, int $$2, eji $$3) {
      eji $$4 = $$0.dj().d($$3);
      boolean $$5 = bvp.a($$0, $$1);
      return bvs.a($$0, () -> {
         ht $$5x = bvs.a($$0.ef(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ht a(blh $$0, int $$1, boolean $$2, ht $$3) {
      ht $$4 = bvs.a($$0, $$1, $$0.ef(), $$3);
      return !bvp.a($$4, $$0) && !bvp.a($$2, $$0, $$4) && !bvp.a($$0.L(), $$4) && !bvp.b($$0, $$4) ? $$4 : null;
   }
}
