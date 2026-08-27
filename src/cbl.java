import javax.annotation.Nullable;

public class cbl {
   @Nullable
   public static esj a(brb $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cbo.a($$0, $$1);
      return cbr.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static id a(brb $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      id $$8 = cbr.a($$0.ei(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         id $$9 = cbr.a($$0, $$1, $$0.ei(), $$8);
         if (!cbo.a($$9, $$0) && !cbo.a($$7, $$0, $$9)) {
            $$9 = cbr.a($$9, $$0.dM().al(), $$1x -> cbo.c($$0, $$1x));
            return cbo.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
