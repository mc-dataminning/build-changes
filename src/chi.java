import javax.annotation.Nullable;

public class chi {
   @Nullable
   public static fcu a(bwz $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = chl.a($$0, $$1);
      return cho.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jj a(bwz $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jj $$8 = cho.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jj $$9 = cho.a($$0, $$1, $$0.dY(), $$8);
         if (!chl.a($$9, $$0) && !chl.a($$7, $$0, $$9)) {
            $$9 = cho.a($$9, $$0.dV().ao(), $$1x -> chl.c($$0, $$1x));
            return chl.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
