import javax.annotation.Nullable;

public class bvw {
   @Nullable
   public static eju a(blp $$0, int $$1, int $$2) {
      boolean $$3 = bvx.a($$0, $$1);
      return bwa.a($$0, () -> {
         ht $$4 = bwa.a($$0.eh(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eju a(blp $$0, int $$1, int $$2, eju $$3, double $$4) {
      eju $$5 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$6 = bvx.a($$0, $$1);
      return bwa.a($$0, () -> {
         ht $$6x = bwa.a($$0.eh(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eju a(blp $$0, int $$1, int $$2, eju $$3) {
      eju $$4 = $$0.dl().d($$3);
      boolean $$5 = bvx.a($$0, $$1);
      return bwa.a($$0, () -> {
         ht $$5x = bwa.a($$0.eh(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ht a(blp $$0, int $$1, boolean $$2, ht $$3) {
      ht $$4 = bwa.a($$0, $$1, $$0.eh(), $$3);
      return !bvx.a($$4, $$0) && !bvx.a($$2, $$0, $$4) && !bvx.a($$0.N(), $$4) && !bvx.b($$0, $$4) ? $$4 : null;
   }
}
