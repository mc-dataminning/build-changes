import java.util.Optional;
import javax.annotation.Nullable;

public interface dtb extends dmc, dqp {
   @Override
   default boolean a(@Nullable bwz $$0, dhv $$1, iu $$2, dzo $$3, evu $$4) {
      return $$4 == evw.c;
   }

   @Override
   default boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      if (!$$2.c(eae.I) && $$3.a() == evw.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(eae.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cys a(@Nullable bwz $$0, diq $$1, iu $$2, dzo $$3) {
      if ($$3.c(eae.I)) {
         $$1.a($$2, $$3.b(eae.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cys(cyw.rk);
      } else {
         return cys.k;
      }
   }

   @Override
   default Optional<awk> ao_() {
      return evw.c.j();
   }
}
