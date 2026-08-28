import java.util.Optional;
import javax.annotation.Nullable;

public interface doz extends dif, dmo {
   @Override
   default boolean a(@Nullable coh $$0, dea $$1, jg $$2, dvd $$3, erd $$4) {
      return $$4 == erf.c;
   }

   @Override
   default boolean a(dew $$0, jg $$1, dvd $$2, ere $$3) {
      if (!$$2.c(dvt.C) && $$3.a() == erf.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.b(dvt.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cvx a(@Nullable coh $$0, dew $$1, jg $$2, dvd $$3) {
      if ($$3.c(dvt.C)) {
         $$1.a($$2, $$3.b(dvt.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cvx(cwb.qA);
      } else {
         return cvx.k;
      }
   }

   @Override
   default Optional<awj> au_() {
      return erf.c.j();
   }
}
