import java.util.Optional;
import javax.annotation.Nullable;

public interface dqt extends djv, dog {
   @Override
   default boolean a(@Nullable coy $$0, dfo $$1, ji $$2, dwy $$3, esz $$4) {
      return $$4 == etb.c;
   }

   @Override
   default boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      if (!$$2.c(dxo.J) && $$3.a() == etb.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dxo.J, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cwq a(@Nullable coy $$0, dgk $$1, ji $$2, dwy $$3) {
      if ($$3.c(dxo.J)) {
         $$1.a($$2, $$3.b(dxo.J, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cwq(cwu.rg);
      } else {
         return cwq.j;
      }
   }

   @Override
   default Optional<avz> as_() {
      return etb.c.j();
   }
}
