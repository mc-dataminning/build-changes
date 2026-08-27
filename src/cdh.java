import javax.annotation.Nullable;

public class cdh {
   @Nullable
   public static euk a(bsx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cdk.a($$0, $$1);
      return cdn.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static io a(bsx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      io $$8 = cdn.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         io $$9 = cdn.a($$0, $$1, $$0.el(), $$8);
         if (!cdk.a($$9, $$0) && !cdk.a($$7, $$0, $$9)) {
            $$9 = cdn.a($$9, $$0.dP().al(), $$1x -> cdk.c($$0, $$1x));
            return cdk.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
