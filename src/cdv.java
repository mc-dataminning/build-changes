import javax.annotation.Nullable;

public class cdv {
   @Nullable
   public static ewh a(btl $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cdy.a($$0, $$1);
      return ceb.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ja a(btl $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ja $$8 = ceb.a($$0.dU(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ja $$9 = ceb.a($$0, $$1, $$0.dU(), $$8);
         if (!cdy.a($$9, $$0) && !cdy.a($$7, $$0, $$9)) {
            $$9 = ceb.a($$9, $$0.dR().am(), $$1x -> cdy.c($$0, $$1x));
            return cdy.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
