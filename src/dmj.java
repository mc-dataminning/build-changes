import java.util.Optional;
import javax.annotation.Nullable;

public interface dmj extends dfp, djz {
   @Override
   default boolean a(@Nullable cml $$0, dbm $$1, ja $$2, dsl $$3, eoi $$4) {
      return $$4 == eok.c;
   }

   @Override
   default boolean a(dch $$0, ja $$1, dsl $$2, eoj $$3) {
      if (!$$2.c(dtb.C) && $$3.a() == eok.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dtb.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cud a(@Nullable cml $$0, dch $$1, ja $$2, dsl $$3) {
      if ($$3.c(dtb.C)) {
         $$1.a($$2, $$3.a(dtb.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cud(cug.qz);
      } else {
         return cud.l;
      }
   }

   @Override
   default Optional<avg> as_() {
      return eok.c.j();
   }
}
