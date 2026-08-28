import java.util.Optional;
import javax.annotation.Nullable;

public interface dtj extends dmi, dqw {
   @Override
   default boolean a(@Nullable bxc $$0, dib $$1, iu $$2, dzz $$3, ewf $$4) {
      return $$4 == ewh.c;
   }

   @Override
   default boolean a(diw $$0, iu $$1, dzz $$2, ewg $$3) {
      if (!$$2.c(eap.I) && $$3.a() == ewh.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(eap.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cyy a(@Nullable bxc $$0, diw $$1, iu $$2, dzz $$3) {
      if ($$3.c(eap.I)) {
         $$1.a($$2, $$3.b(eap.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cyy(czc.rm);
      } else {
         return cyy.k;
      }
   }

   @Override
   default Optional<awm> ao_() {
      return ewh.c.j();
   }
}
