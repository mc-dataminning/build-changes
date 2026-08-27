import java.util.Optional;
import javax.annotation.Nullable;

public interface ddj extends cwq, daz {
   @Override
   default boolean a(@Nullable cfb $$0, cso $$1, hx $$2, dja $$3, eej $$4) {
      return $$4 == eel.c;
   }

   @Override
   default boolean a(ctj $$0, hx $$1, dja $$2, eek $$3) {
      if (!$$2.c(djq.C) && $$3.a() == eel.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(djq.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cmr a(@Nullable cfb $$0, ctj $$1, hx $$2, dja $$3) {
      if ($$3.c(djq.C)) {
         $$1.a($$2, $$3.a(djq.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cmr(cmu.qw);
      } else {
         return cmr.f;
      }
   }

   @Override
   default Optional<arl> au_() {
      return eel.c.j();
   }
}
