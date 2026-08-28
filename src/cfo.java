import javax.annotation.Nullable;

public class cfo {
   @Nullable
   public static ezh a(bvd $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cfr.a($$0, $$1);
      return cfu.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jg a(bvd $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jg $$8 = cfu.a($$0.ea(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jg $$9 = cfu.a($$0, $$1, $$0.ea(), $$8);
         if (!cfr.a($$9, $$0) && !cfr.a($$7, $$0, $$9)) {
            $$9 = cfu.a($$9, $$0.dX().an(), $$1x -> cfr.c($$0, $$1x));
            return cfr.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
