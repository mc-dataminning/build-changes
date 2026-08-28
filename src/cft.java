import javax.annotation.Nullable;

public class cft {
   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cfw.a($$0, $$1);
      return cfz.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jh a(bvi $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jh $$8 = cfz.a($$0.ea(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jh $$9 = cfz.a($$0, $$1, $$0.ea(), $$8);
         if (!cfw.a($$9, $$0) && !cfw.a($$7, $$0, $$9)) {
            $$9 = cfz.a($$9, $$0.dX().al(), $$1x -> cfw.c($$0, $$1x));
            return cfw.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
