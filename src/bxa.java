import javax.annotation.Nullable;

public class bxa {
   @Nullable
   public static els a(bmt $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bxd.a($$0, $$1);
      return bxg.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hx a(bmt $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hx $$8 = bxg.a($$0.eg(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hx $$9 = bxg.a($$0, $$1, $$0.eg(), $$8);
         if (!bxd.a($$9, $$0) && !bxd.a($$7, $$0, $$9)) {
            $$9 = bxg.a($$9, $$0.dM().al(), $$1x -> bxd.c($$0, $$1x));
            return bxd.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
