import java.util.Optional;
import javax.annotation.Nullable;

public interface dqq extends djs, dod {
   @Override
   default boolean a(@Nullable cov $$0, dfl $$1, ji $$2, dwv $$3, esw $$4) {
      return $$4 == esy.c;
   }

   @Override
   default boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      if (!$$2.c(dxl.J) && $$3.a() == esy.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dxl.J, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cwn a(@Nullable cov $$0, dgh $$1, ji $$2, dwv $$3) {
      if ($$3.c(dxl.J)) {
         $$1.a($$2, $$3.b(dxl.J, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cwn(cwr.rg);
      } else {
         return cwn.j;
      }
   }

   @Override
   default Optional<avy> as_() {
      return esy.c.j();
   }
}
