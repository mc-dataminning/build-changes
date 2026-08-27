import javax.annotation.Nullable;

public class buz {
   @Nullable
   public static eif a(bks $$0, int $$1, int $$2) {
      boolean $$3 = bva.a($$0, $$1);
      return bvd.a($$0, () -> {
         ht $$4 = bvd.a($$0.ef(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eif a(bks $$0, int $$1, int $$2, eif $$3, double $$4) {
      eif $$5 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$6 = bva.a($$0, $$1);
      return bvd.a($$0, () -> {
         ht $$6x = bvd.a($$0.ef(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eif a(bks $$0, int $$1, int $$2, eif $$3) {
      eif $$4 = $$0.dj().d($$3);
      boolean $$5 = bva.a($$0, $$1);
      return bvd.a($$0, () -> {
         ht $$5x = bvd.a($$0.ef(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ht a(bks $$0, int $$1, boolean $$2, ht $$3) {
      ht $$4 = bvd.a($$0, $$1, $$0.ef(), $$3);
      return !bva.a($$4, $$0) && !bva.a($$2, $$0, $$4) && !bva.a($$0.L(), $$4) && !bva.b($$0, $$4) ? $$4 : null;
   }
}
