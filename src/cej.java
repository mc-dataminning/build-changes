import javax.annotation.Nullable;

public class cej {
   @Nullable
   public static eww a(btu $$0, int $$1, int $$2, double $$3, double $$4, float $$5, int $$6, int $$7) {
      boolean $$8 = cei.a($$0, $$1);
      return cel.a($$0, () -> {
         jd $$9 = cel.a($$0.dT(), $$1, $$2, 0, $$3, $$4, (double)$$5);
         if ($$9 == null) {
            return null;
         } else {
            jd $$10 = cek.a($$0, $$1, $$8, $$9);
            if ($$10 == null) {
               return null;
            } else {
               $$10 = cel.a($$10, $$0.dT().a($$6 - $$7 + 1) + $$7, $$0.dQ().am(), $$1xx -> cei.c($$0, $$1xx));
               return !cei.a($$0, $$10) && !cei.b($$0, $$10) ? $$10 : null;
            }
         }
      });
   }
}
