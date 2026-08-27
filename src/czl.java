import java.util.Optional;
import javax.annotation.Nullable;

public interface czl extends csq, cwy {
   @Override
   default boolean a(@Nullable cbl $$0, coq $$1, gv $$2, dey $$3, eaa $$4) {
      return $$4 == eac.c;
   }

   @Override
   default boolean a(cpl $$0, gv $$1, dey $$2, eab $$3) {
      if (!$$2.c(dfo.C) && $$3.a() == eac.c) {
         if (!$$0.r_()) {
            $$0.a($$1, $$2.a(dfo.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default ciw a(@Nullable cbl $$0, cpl $$1, gv $$2, dey $$3) {
      if ($$3.c(dfo.C)) {
         $$1.a($$2, $$3.a(dfo.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new ciw(ciz.pL);
      } else {
         return ciw.b;
      }
   }

   @Override
   default Optional<aot> am_() {
      return eac.c.j();
   }
}
