import java.util.Optional;
import javax.annotation.Nullable;

public interface czw extends ctb, cxj {
   @Override
   default boolean a(@Nullable cbu $$0, cpb $$1, gw $$2, dfj $$3, eal $$4) {
      return $$4 == ean.c;
   }

   @Override
   default boolean a(cpw $$0, gw $$1, dfj $$2, eam $$3) {
      if (!$$2.c(dfz.C) && $$3.a() == ean.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.a(dfz.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cjf a(@Nullable cbu $$0, cpw $$1, gw $$2, dfj $$3) {
      if ($$3.c(dfz.C)) {
         $$1.a($$2, $$3.a(dfz.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cjf(cji.pL);
      } else {
         return cjf.b;
      }
   }

   @Override
   default Optional<apd> aq_() {
      return ean.c.j();
   }
}
