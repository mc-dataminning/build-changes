import javax.annotation.Nullable;

public class btl {
   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = bto.a($$0, $$1);
      return btr.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static gv a(bjf $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      gv $$8 = btr.a($$0.ee(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         gv $$9 = btr.a($$0, $$1, $$0.ee(), $$8);
         if (!bto.a($$9, $$0) && !bto.a($$7, $$0, $$9)) {
            $$9 = btr.a($$9, $$0.dK().aj(), $$1x -> bto.c($$0, $$1x));
            return bto.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
