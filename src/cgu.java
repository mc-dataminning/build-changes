import javax.annotation.Nullable;

public class cgu {
   @Nullable
   public static fbs a(bwj $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cgx.a($$0, $$1);
      return cha.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jh a(bwj $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jh $$8 = cha.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jh $$9 = cha.a($$0, $$1, $$0.dY(), $$8);
         if (!cgx.a($$9, $$0) && !cgx.a($$7, $$0, $$9)) {
            $$9 = cha.a($$9, $$0.dV().am(), $$1x -> cgx.c($$0, $$1x));
            return cgx.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
