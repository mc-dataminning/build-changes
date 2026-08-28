import javax.annotation.Nullable;

public class cia {
   @Nullable
   public static ffc a(bxr $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cid.a($$0, $$1);
      return cig.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iv a(bxr $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iv $$8 = cig.a($$0.dX(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iv $$9 = cig.a($$0, $$1, $$0.dX(), $$8);
         if (!cid.a($$9, $$0) && !cid.a($$7, $$0, $$9)) {
            $$9 = cig.a($$9, $$0.dU().ao(), $$1x -> cid.c($$0, $$1x));
            return cid.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
