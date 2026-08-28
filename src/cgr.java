import javax.annotation.Nullable;

public class cgr {
   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cgu.a($$0, $$1);
      return cgx.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ji a(bwg $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ji $$8 = cgx.a($$0.dX(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ji $$9 = cgx.a($$0, $$1, $$0.dX(), $$8);
         if (!cgu.a($$9, $$0) && !cgu.a($$7, $$0, $$9)) {
            $$9 = cgx.a($$9, $$0.dU().ao(), $$1x -> cgu.c($$0, $$1x));
            return cgu.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
