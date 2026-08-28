import java.util.Optional;
import javax.annotation.Nullable;

public interface dqr extends djt, doe {
   @Override
   default boolean a(@Nullable cow $$0, dfm $$1, ji $$2, dww $$3, esx $$4) {
      return $$4 == esz.c;
   }

   @Override
   default boolean a(dgi $$0, ji $$1, dww $$2, esy $$3) {
      if (!$$2.c(dxm.J) && $$3.a() == esz.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dxm.J, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cwo a(@Nullable cow $$0, dgi $$1, ji $$2, dww $$3) {
      if ($$3.c(dxm.J)) {
         $$1.a($$2, $$3.b(dxm.J, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cwo(cws.rg);
      } else {
         return cwo.j;
      }
   }

   @Override
   default Optional<avz> as_() {
      return esz.c.j();
   }
}
