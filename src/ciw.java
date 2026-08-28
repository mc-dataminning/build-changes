import javax.annotation.Nullable;

public class ciw {
   @Nullable
   public static fgc a(byn $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = ciz.a($$0, $$1);
      return cjc.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iw a(byn $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iw $$8 = cjc.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iw $$9 = cjc.a($$0, $$1, $$0.dY(), $$8);
         if (!ciz.a($$9, $$0) && !ciz.a($$7, $$0, $$9)) {
            $$9 = cjc.a($$9, $$0.dV().ao(), $$1x -> ciz.c($$0, $$1x));
            return ciz.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
