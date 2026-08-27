import javax.annotation.Nullable;

public class bxb {
   @Nullable
   public static elt a(bmu $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bxe.a($$0, $$1);
      return bxh.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hx a(bmu $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hx $$8 = bxh.a($$0.eg(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hx $$9 = bxh.a($$0, $$1, $$0.eg(), $$8);
         if (!bxe.a($$9, $$0) && !bxe.a($$7, $$0, $$9)) {
            $$9 = bxh.a($$9, $$0.dM().al(), $$1x -> bxe.c($$0, $$1x));
            return bxe.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
