import java.util.Optional;
import javax.annotation.Nullable;

public interface dab extends ctj, cxr {
   @Override
   default boolean a(@Nullable cca $$0, cph $$1, gw $$2, dfd $$3, eaf $$4) {
      return $$4 == eah.c;
   }

   @Override
   default boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      if (!$$2.c(dft.C) && $$3.a() == eah.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.a(dft.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cjl a(@Nullable cca $$0, cqc $$1, gw $$2, dfd $$3) {
      if ($$3.c(dft.C)) {
         $$1.a($$2, $$3.a(dft.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cjl(cjo.pL);
      } else {
         return cjl.b;
      }
   }

   @Override
   default Optional<apf> aq_() {
      return eah.c.j();
   }
}
