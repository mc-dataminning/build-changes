import java.util.Optional;
import javax.annotation.Nullable;

public interface ddp extends cww, dbf {
   @Override
   default boolean a(@Nullable cfh $$0, csu $$1, hx $$2, djg $$3, eep $$4) {
      return $$4 == eer.c;
   }

   @Override
   default boolean a(ctp $$0, hx $$1, djg $$2, eeq $$3) {
      if (!$$2.c(djw.C) && $$3.a() == eer.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(djw.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cmx a(@Nullable cfh $$0, ctp $$1, hx $$2, djg $$3) {
      if ($$3.c(djw.C)) {
         $$1.a($$2, $$3.a(djw.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cmx(cna.qw);
      } else {
         return cmx.f;
      }
   }

   @Override
   default Optional<arq> au_() {
      return eer.c.j();
   }
}
