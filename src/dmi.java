import java.util.Optional;
import javax.annotation.Nullable;

public interface dmi extends dfo, djy {
   @Override
   default boolean a(@Nullable cmk $$0, dbl $$1, ja $$2, dsk $$3, eog $$4) {
      return $$4 == eoi.c;
   }

   @Override
   default boolean a(dcg $$0, ja $$1, dsk $$2, eoh $$3) {
      if (!$$2.c(dta.C) && $$3.a() == eoi.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dta.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cuc a(@Nullable cmk $$0, dcg $$1, ja $$2, dsk $$3) {
      if ($$3.c(dta.C)) {
         $$1.a($$2, $$3.a(dta.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cuc(cuf.qz);
      } else {
         return cuc.l;
      }
   }

   @Override
   default Optional<avg> as_() {
      return eoi.c.j();
   }
}
