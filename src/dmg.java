import java.util.Optional;
import javax.annotation.Nullable;

public interface dmg extends dfm, djw {
   @Override
   default boolean a(@Nullable cmh $$0, dbj $$1, ja $$2, dsh $$3, eoa $$4) {
      return $$4 == eoc.c;
   }

   @Override
   default boolean a(dce $$0, ja $$1, dsh $$2, eob $$3) {
      if (!$$2.c(dsx.C) && $$3.a() == eoc.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dsx.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cua a(@Nullable cmh $$0, dce $$1, ja $$2, dsh $$3) {
      if ($$3.c(dsx.C)) {
         $$1.a($$2, $$3.a(dsx.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cua(cud.qz);
      } else {
         return cua.l;
      }
   }

   @Override
   default Optional<ave> as_() {
      return eoc.c.j();
   }
}
