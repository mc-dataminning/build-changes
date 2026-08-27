import javax.annotation.Nullable;

public class bxf {
   @Nullable
   public static emc a(bmx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bxi.a($$0, $$1);
      return bxl.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hx a(bmx $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hx $$8 = bxl.a($$0.eg(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hx $$9 = bxl.a($$0, $$1, $$0.eg(), $$8);
         if (!bxi.a($$9, $$0) && !bxi.a($$7, $$0, $$9)) {
            $$9 = bxl.a($$9, $$0.dL().al(), $$1x -> bxi.c($$0, $$1x));
            return bxi.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
