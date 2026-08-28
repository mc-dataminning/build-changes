import javax.annotation.Nullable;

public class cil {
   @Nullable
   public static ffq a(byc $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cio.a($$0, $$1);
      return cir.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iv a(byc $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iv $$8 = cir.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iv $$9 = cir.a($$0, $$1, $$0.dY(), $$8);
         if (!cio.a($$9, $$0) && !cio.a($$7, $$0, $$9)) {
            $$9 = cir.a($$9, $$0.dV().ao(), $$1x -> cio.c($$0, $$1x));
            return cio.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
