import java.util.Optional;
import javax.annotation.Nullable;

public interface dpr extends dix, dng {
   @Override
   default boolean a(@Nullable cou $$0, der $$1, jh $$2, dvv $$3, eru $$4) {
      return $$4 == erw.c;
   }

   @Override
   default boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      if (!$$2.c(dwl.C) && $$3.a() == erw.c) {
         if (!$$0.A_()) {
            $$0.a($$1, $$2.b(dwl.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cwm a(@Nullable cou $$0, dfn $$1, jh $$2, dvv $$3) {
      if ($$3.c(dwl.C)) {
         $$1.a($$2, $$3.b(dwl.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cwm(cwq.qA);
      } else {
         return cwm.k;
      }
   }

   @Override
   default Optional<awm> as_() {
      return erw.c.j();
   }
}
