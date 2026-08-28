import javax.annotation.Nullable;

public class cga {
   @Nullable
   public static ezy a(bvp $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cgd.a($$0, $$1);
      return cgg.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jh a(bvp $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jh $$8 = cgg.a($$0.dY(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jh $$9 = cgg.a($$0, $$1, $$0.dY(), $$8);
         if (!cgd.a($$9, $$0) && !cgd.a($$7, $$0, $$9)) {
            $$9 = cgg.a($$9, $$0.dV().al(), $$1x -> cgd.c($$0, $$1x));
            return cgd.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
