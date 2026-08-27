import javax.annotation.Nullable;

public class cag {
   @Nullable
   public static epr a(bpw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = caj.a($$0, $$1);
      return cam.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ib a(bpw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ib $$8 = cam.a($$0.ei(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ib $$9 = cam.a($$0, $$1, $$0.ei(), $$8);
         if (!caj.a($$9, $$0) && !caj.a($$7, $$0, $$9)) {
            $$9 = cam.a($$9, $$0.dM().ak(), $$1x -> caj.c($$0, $$1x));
            return caj.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
