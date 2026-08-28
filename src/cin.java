import javax.annotation.Nullable;

public class cin {
   @Nullable
   public static ffs a(bye $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = ciq.a($$0, $$1);
      return cit.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iw a(bye $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iw $$8 = cit.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iw $$9 = cit.a($$0, $$1, $$0.dY(), $$8);
         if (!ciq.a($$9, $$0) && !ciq.a($$7, $$0, $$9)) {
            $$9 = cit.a($$9, $$0.dV().ao(), $$1x -> ciq.c($$0, $$1x));
            return ciq.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
