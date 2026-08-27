import javax.annotation.Nullable;

public class bwv {
   @Nullable
   public static elm a(bmo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bwy.a($$0, $$1);
      return bxb.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hx a(bmo $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hx $$8 = bxb.a($$0.eg(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hx $$9 = bxb.a($$0, $$1, $$0.eg(), $$8);
         if (!bwy.a($$9, $$0) && !bwy.a($$7, $$0, $$9)) {
            $$9 = bxb.a($$9, $$0.dM().al(), $$1x -> bwy.c($$0, $$1x));
            return bwy.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
