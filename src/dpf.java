import java.util.Optional;
import javax.annotation.Nullable;

public interface dpf extends dil, dmu {
   @Override
   default boolean a(@Nullable com $$0, deg $$1, jh $$2, dvj $$3, erj $$4) {
      return $$4 == erl.c;
   }

   @Override
   default boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      if (!$$2.c(dvz.C) && $$3.a() == erl.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.b(dvz.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cwb a(@Nullable com $$0, dfc $$1, jh $$2, dvj $$3) {
      if ($$3.c(dvz.C)) {
         $$1.a($$2, $$3.b(dvz.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cwb(cwf.qA);
      } else {
         return cwb.k;
      }
   }

   @Override
   default Optional<awk> at_() {
      return erl.c.j();
   }
}
