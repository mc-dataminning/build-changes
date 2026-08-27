import javax.annotation.Nullable;

public class cdg {
   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cdj.a($$0, $$1);
      return cdm.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ir a(bsw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ir $$8 = cdm.a($$0.et(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ir $$9 = cdm.a($$0, $$1, $$0.et(), $$8);
         if (!cdj.a($$9, $$0) && !cdj.a($$7, $$0, $$9)) {
            $$9 = cdm.a($$9, $$0.dU().am(), $$1x -> cdj.c($$0, $$1x));
            return cdj.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
