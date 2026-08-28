import javax.annotation.Nullable;

public class chq {
   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cht.a($$0, $$1);
      return chw.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static iu a(bxh $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      iu $$8 = chw.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         iu $$9 = chw.a($$0, $$1, $$0.dY(), $$8);
         if (!cht.a($$9, $$0) && !cht.a($$7, $$0, $$9)) {
            $$9 = chw.a($$9, $$0.dV().ao(), $$1x -> cht.c($$0, $$1x));
            return cht.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
