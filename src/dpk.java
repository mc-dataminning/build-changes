import java.util.Optional;
import javax.annotation.Nullable;

public interface dpk extends diq, dmz {
   @Override
   default boolean a(@Nullable cor $$0, dek $$1, jh $$2, dvo $$3, ern $$4) {
      return $$4 == erp.c;
   }

   @Override
   default boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      if (!$$2.c(dwe.C) && $$3.a() == erp.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.b(dwe.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cwf a(@Nullable cor $$0, dfg $$1, jh $$2, dvo $$3) {
      if ($$3.c(dwe.C)) {
         $$1.a($$2, $$3.b(dwe.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cwf(cwj.qA);
      } else {
         return cwf.k;
      }
   }

   @Override
   default Optional<awn> at_() {
      return erp.c.j();
   }
}
