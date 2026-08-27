import java.util.Optional;
import javax.annotation.Nullable;

public interface dbt extends cva, czj {
   @Override
   default boolean a(@Nullable cdm $$0, cqy $$1, ht $$2, dgw $$3, ecf $$4) {
      return $$4 == ech.c;
   }

   @Override
   default boolean a(crt $$0, ht $$1, dgw $$2, ecg $$3) {
      if (!$$2.c(dhm.C) && $$3.a() == ech.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dhm.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default clb a(@Nullable cdm $$0, crt $$1, ht $$2, dgw $$3) {
      if ($$3.c(dhm.C)) {
         $$1.a($$2, $$3.a(dhm.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new clb(cle.pL);
      } else {
         return clb.b;
      }
   }

   @Override
   default Optional<aqm> at_() {
      return ech.c.j();
   }
}
