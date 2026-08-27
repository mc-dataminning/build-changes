import java.util.Optional;
import javax.annotation.Nullable;

public interface dgf extends czm, ddv {
   @Override
   default boolean a(@Nullable cia $$0, cvk $$1, ib $$2, dme $$3, ehq $$4) {
      return $$4 == ehs.c;
   }

   @Override
   default boolean a(cwf $$0, ib $$1, dme $$2, ehr $$3) {
      if (!$$2.c(dmu.C) && $$3.a() == ehs.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(dmu.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cpq a(@Nullable cia $$0, cwf $$1, ib $$2, dme $$3) {
      if ($$3.c(dmu.C)) {
         $$1.a($$2, $$3.a(dmu.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cpq(cpt.qy);
      } else {
         return cpq.h;
      }
   }

   @Override
   default Optional<ato> aw_() {
      return ehs.c.j();
   }
}
