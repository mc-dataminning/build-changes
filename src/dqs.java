import java.util.Optional;
import javax.annotation.Nullable;

public interface dqs extends dju, dof {
   @Override
   default boolean a(@Nullable cox $$0, dfn $$1, ji $$2, dwx $$3, esy $$4) {
      return $$4 == eta.c;
   }

   @Override
   default boolean a(dgj $$0, ji $$1, dwx $$2, esz $$3) {
      if (!$$2.c(dxn.J) && $$3.a() == eta.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dxn.J, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cwp a(@Nullable cox $$0, dgj $$1, ji $$2, dwx $$3) {
      if ($$3.c(dxn.J)) {
         $$1.a($$2, $$3.b(dxn.J, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cwp(cwt.rg);
      } else {
         return cwp.j;
      }
   }

   @Override
   default Optional<avz> as_() {
      return eta.c.j();
   }
}
