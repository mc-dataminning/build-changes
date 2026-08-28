import javax.annotation.Nullable;

public class cht {
   @Nullable
   public static fei a(bxk $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = chw.a($$0, $$1);
      return chz.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iu a(bxk $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iu $$8 = chz.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iu $$9 = chz.a($$0, $$1, $$0.dY(), $$8);
         if (!chw.a($$9, $$0) && !chw.a($$7, $$0, $$9)) {
            $$9 = chz.a($$9, $$0.dV().ao(), $$1x -> chw.c($$0, $$1x));
            return chw.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
