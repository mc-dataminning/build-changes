import javax.annotation.Nullable;

public class cdj {
   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2) {
      boolean $$3 = cdk.a($$0, $$1);
      return cdn.a($$0, () -> {
         io $$4 = cdn.a($$0.el(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2, euk $$3, double $$4) {
      euk $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cdk.a($$0, $$1);
      return cdn.a($$0, () -> {
         io $$6x = cdn.a($$0.el(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2, euk $$3) {
      euk $$4 = $$0.dn().d($$3);
      boolean $$5 = cdk.a($$0, $$1);
      return cdn.a($$0, () -> {
         io $$5x = cdn.a($$0.el(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static io a(bsx $$0, int $$1, boolean $$2, io $$3) {
      io $$4 = cdn.a($$0, $$1, $$0.el(), $$3);
      return !cdk.a($$4, $$0) && !cdk.a($$2, $$0, $$4) && !cdk.a($$0.K(), $$4) && !cdk.b($$0, $$4) ? $$4 : null;
   }
}
