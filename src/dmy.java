import java.util.Optional;
import javax.annotation.Nullable;

public interface dmy extends dgd, dkn {
   @Override
   default boolean a(@Nullable cmv $$0, dca $$1, jd $$2, dta $$3, eox $$4) {
      return $$4 == eoz.c;
   }

   @Override
   default boolean a(dcv $$0, jd $$1, dta $$2, eoy $$3) {
      if (!$$2.c(dtq.C) && $$3.a() == eoz.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dtq.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cuo a(@Nullable cmv $$0, dcv $$1, jd $$2, dta $$3) {
      if ($$3.c(dtq.C)) {
         $$1.a($$2, $$3.a(dtq.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cuo(cur.qz);
      } else {
         return cuo.l;
      }
   }

   @Override
   default Optional<avn> as_() {
      return eoz.c.j();
   }
}
