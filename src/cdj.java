import javax.annotation.Nullable;

public class cdj {
   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cdm.a($$0, $$1);
      return cdp.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static io a(bsz $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      io $$8 = cdp.a($$0.el(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         io $$9 = cdp.a($$0, $$1, $$0.el(), $$8);
         if (!cdm.a($$9, $$0) && !cdm.a($$7, $$0, $$9)) {
            $$9 = cdp.a($$9, $$0.dP().al(), $$1x -> cdm.c($$0, $$1x));
            return cdm.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
