import java.util.Optional;
import javax.annotation.Nullable;

public interface dsb extends dlc, dpp {
   @Override
   default boolean a(@Nullable bwr $$0, dgv $$1, jj $$2, dym $$3, eus $$4) {
      return $$4 == euu.c;
   }

   @Override
   default boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      if (!$$2.c(dzc.I) && $$3.a() == euu.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(dzc.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cxy a(@Nullable bwr $$0, dhq $$1, jj $$2, dym $$3) {
      if ($$3.c(dzc.I)) {
         $$1.a($$2, $$3.b(dzc.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cxy(cyc.rk);
      } else {
         return cxy.k;
      }
   }

   @Override
   default Optional<awj> ao_() {
      return euu.c.j();
   }
}
