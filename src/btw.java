import javax.annotation.Nullable;

public class btw {
   @Nullable
   public static ehp a(bjr $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = btz.a($$0, $$1);
      return buc.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gw a(bjr $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gw $$8 = buc.a($$0.ef(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gw $$9 = buc.a($$0, $$1, $$0.ef(), $$8);
         if (!btz.a($$9, $$0) && !btz.a($$7, $$0, $$9)) {
            $$9 = buc.a($$9, $$0.dL().aj(), $$1x -> btz.c($$0, $$1x));
            return btz.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
