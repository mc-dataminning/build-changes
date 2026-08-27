import java.util.Optional;
import javax.annotation.Nullable;

public interface czm extends csr, cwz {
   @Override
   default boolean a(@Nullable cbm $$0, cor $$1, gu $$2, dez $$3, eab $$4) {
      return $$4 == ead.c;
   }

   @Override
   default boolean a(cpm $$0, gu $$1, dez $$2, eac $$3) {
      if (!$$2.c(dfp.C) && $$3.a() == ead.c) {
         if (!$$0.r_()) {
            $$0.a($$1, $$2.a(dfp.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cix a(@Nullable cbm $$0, cpm $$1, gu $$2, dez $$3) {
      if ($$3.c(dfp.C)) {
         $$1.a($$2, $$3.a(dfp.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cix(cja.pL);
      } else {
         return cix.b;
      }
   }

   @Override
   default Optional<aov> al_() {
      return ead.c.j();
   }
}
