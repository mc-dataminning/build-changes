import javax.annotation.Nullable;

public class cbw {
   @Nullable
   public static etf a(brm $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cbz.a($$0, $$1);
      return ccc.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static im a(brm $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      im $$8 = ccc.a($$0.ej(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         im $$9 = ccc.a($$0, $$1, $$0.ej(), $$8);
         if (!cbz.a($$9, $$0) && !cbz.a($$7, $$0, $$9)) {
            $$9 = ccc.a($$9, $$0.dN().al(), $$1x -> cbz.c($$0, $$1x));
            return cbz.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
