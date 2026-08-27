import java.util.Optional;
import javax.annotation.Nullable;

public interface dha extends dah, deq {
   @Override
   default boolean a(@Nullable cis $$0, cwf $$1, ib $$2, dmz $$3, eim $$4) {
      return $$4 == eio.c;
   }

   @Override
   default boolean a(cxa $$0, ib $$1, dmz $$2, ein $$3) {
      if (!$$2.c(dnp.C) && $$3.a() == eio.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dnp.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cqk a(@Nullable cis $$0, cxa $$1, ib $$2, dmz $$3) {
      if ($$3.c(dnp.C)) {
         $$1.a($$2, $$3.a(dnp.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cqk(cqn.qy);
      } else {
         return cqk.h;
      }
   }

   @Override
   default Optional<atx> av_() {
      return eio.c.j();
   }
}
