import javax.annotation.Nullable;

public class cdu {
   @Nullable
   public static ewf a(btk $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cdx.a($$0, $$1);
      return cea.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ja a(btk $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ja $$8 = cea.a($$0.dT(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ja $$9 = cea.a($$0, $$1, $$0.dT(), $$8);
         if (!cdx.a($$9, $$0) && !cdx.a($$7, $$0, $$9)) {
            $$9 = cea.a($$9, $$0.dQ().am(), $$1x -> cdx.c($$0, $$1x));
            return cdx.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
