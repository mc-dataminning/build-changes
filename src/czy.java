import java.util.Optional;
import javax.annotation.Nullable;

public interface czy extends ctd, cxl {
   @Override
   default boolean a(@Nullable cbw $$0, cpd $$1, gw $$2, dfl $$3, ean $$4) {
      return $$4 == eap.c;
   }

   @Override
   default boolean a(cpy $$0, gw $$1, dfl $$2, eao $$3) {
      if (!$$2.c(dgb.C) && $$3.a() == eap.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.a(dgb.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cjh a(@Nullable cbw $$0, cpy $$1, gw $$2, dfl $$3) {
      if ($$3.c(dgb.C)) {
         $$1.a($$2, $$3.a(dgb.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cjh(cjk.pL);
      } else {
         return cjh.b;
      }
   }

   @Override
   default Optional<ape> aq_() {
      return eap.c.j();
   }
}
