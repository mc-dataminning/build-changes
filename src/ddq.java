import java.util.Optional;
import javax.annotation.Nullable;

public interface ddq extends cwx, dbg {
   @Override
   default boolean a(@Nullable cfi $$0, csv $$1, hx $$2, djh $$3, eeq $$4) {
      return $$4 == ees.c;
   }

   @Override
   default boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      if (!$$2.c(djx.C) && $$3.a() == ees.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(djx.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cmy a(@Nullable cfi $$0, ctq $$1, hx $$2, djh $$3) {
      if ($$3.c(djx.C)) {
         $$1.a($$2, $$3.a(djx.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cmy(cnb.qw);
      } else {
         return cmy.f;
      }
   }

   @Override
   default Optional<arr> au_() {
      return ees.c.j();
   }
}
