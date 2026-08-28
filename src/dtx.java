import java.util.Optional;
import javax.annotation.Nullable;

public interface dtx extends dmu, drj {
   @Override
   default boolean a(@Nullable bxj $$0, din $$1, iv $$2, eao $$3, ewu $$4) {
      return $$4 == eww.c;
   }

   @Override
   default boolean a(dji $$0, iv $$1, eao $$2, ewv $$3) {
      if (!$$2.c(ebe.I) && $$3.a() == eww.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(ebe.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default czk a(@Nullable bxj $$0, dji $$1, iv $$2, eao $$3) {
      if ($$3.c(ebe.I)) {
         $$1.a($$2, $$3.b(ebe.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new czk(czo.rp);
      } else {
         return czk.k;
      }
   }

   @Override
   default Optional<awm> ap_() {
      return eww.c.j();
   }
}
