import java.util.Optional;
import javax.annotation.Nullable;

public interface doo extends dht, dmd {
   @Override
   default boolean a(@Nullable cnx $$0, ddo $$1, jf $$2, dus $$3, eqs $$4) {
      return $$4 == equ.c;
   }

   @Override
   default boolean a(dek $$0, jf $$1, dus $$2, eqt $$3) {
      if (!$$2.c(dvi.C) && $$3.a() == equ.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.b(dvi.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cvs a(@Nullable cnx $$0, dek $$1, jf $$2, dus $$3) {
      if ($$3.c(dvi.C)) {
         $$1.a($$2, $$3.b(dvi.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cvs(cvw.qA);
      } else {
         return cvs.k;
      }
   }

   @Override
   default Optional<awf> au_() {
      return equ.c.j();
   }
}
