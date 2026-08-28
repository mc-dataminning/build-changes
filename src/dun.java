import java.util.Optional;
import javax.annotation.Nullable;

public interface dun extends dnk, drz {
   @Override
   default boolean a(@Nullable bxu $$0, djb $$1, iv $$2, ebe $$3, exn $$4) {
      return $$4 == exp.c;
   }

   @Override
   default boolean a(djy $$0, iv $$1, ebe $$2, exo $$3) {
      if (!$$2.c(ebu.I) && $$3.a() == exp.c) {
         if (!$$0.A_()) {
            $$0.a($$1, $$2.b(ebu.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default czy a(@Nullable bxu $$0, djy $$1, iv $$2, ebe $$3) {
      if ($$3.c(ebu.I)) {
         $$1.a($$2, $$3.b(ebu.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new czy(dac.rp);
      } else {
         return czy.k;
      }
   }

   @Override
   default Optional<awo> at_() {
      return exp.c.j();
   }
}
