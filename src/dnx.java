import java.util.Optional;
import javax.annotation.Nullable;

public interface dnx extends dhc, dlm {
   @Override
   default boolean a(@Nullable cnp $$0, dcx $$1, je $$2, dua $$3, eqa $$4) {
      return $$4 == eqc.c;
   }

   @Override
   default boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      if (!$$2.c(duq.C) && $$3.a() == eqc.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(duq.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cvl a(@Nullable cnp $$0, ddt $$1, je $$2, dua $$3) {
      if ($$3.c(duq.C)) {
         $$1.a($$2, $$3.b(duq.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cvl(cvo.qA);
      } else {
         return cvl.k;
      }
   }

   @Override
   default Optional<awc> av_() {
      return eqc.c.j();
   }
}
