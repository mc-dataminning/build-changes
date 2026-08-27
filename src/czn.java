import java.util.Optional;
import javax.annotation.Nullable;

public interface czn extends css, cxa {
   @Override
   default boolean a(@Nullable cbn $$0, cos $$1, gu $$2, dfa $$3, eac $$4) {
      return $$4 == eae.c;
   }

   @Override
   default boolean a(cpn $$0, gu $$1, dfa $$2, ead $$3) {
      if (!$$2.c(dfq.C) && $$3.a() == eae.c) {
         if (!$$0.r_()) {
            $$0.a($$1, $$2.a(dfq.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default ciy a(@Nullable cbn $$0, cpn $$1, gu $$2, dfa $$3) {
      if ($$3.c(dfq.C)) {
         $$1.a($$2, $$3.a(dfq.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new ciy(cjb.pL);
      } else {
         return ciy.b;
      }
   }

   @Override
   default Optional<aov> am_() {
      return eae.c.j();
   }
}
