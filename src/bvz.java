import javax.annotation.Nullable;

public class bvz {
   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bwc.a($$0, $$1);
      return bwf.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static hx a(blu $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      hx $$8 = bwf.a($$0.eh(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         hx $$9 = bwf.a($$0, $$1, $$0.eh(), $$8);
         if (!bwc.a($$9, $$0) && !bwc.a($$7, $$0, $$9)) {
            $$9 = bwf.a($$9, $$0.dN().ak(), $$1x -> bwc.c($$0, $$1x));
            return bwc.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
