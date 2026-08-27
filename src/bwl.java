import javax.annotation.Nullable;

public class bwl {
   @Nullable
   public static elb a(bme $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bwo.a($$0, $$1);
      return bwr.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hv a(bme $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hv $$8 = bwr.a($$0.eg(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hv $$9 = bwr.a($$0, $$1, $$0.eg(), $$8);
         if (!bwo.a($$9, $$0) && !bwo.a($$7, $$0, $$9)) {
            $$9 = bwr.a($$9, $$0.dM().ak(), $$1x -> bwo.c($$0, $$1x));
            return bwo.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
