import javax.annotation.Nullable;

public class cbg {
   @Nullable
   public static esa a(bqw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cbj.a($$0, $$1);
      return cbm.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static ib a(bqw $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      ib $$8 = cbm.a($$0.ei(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         ib $$9 = cbm.a($$0, $$1, $$0.ei(), $$8);
         if (!cbj.a($$9, $$0) && !cbj.a($$7, $$0, $$9)) {
            $$9 = cbm.a($$9, $$0.dM().al(), $$1x -> cbj.c($$0, $$1x));
            return cbj.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
