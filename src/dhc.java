import java.util.Optional;
import javax.annotation.Nullable;

public interface dhc extends daj, des {
   @Override
   default boolean a(@Nullable ciu $$0, cwh $$1, ib $$2, dnb $$3, eio $$4) {
      return $$4 == eiq.c;
   }

   @Override
   default boolean a(cxc $$0, ib $$1, dnb $$2, eip $$3) {
      if (!$$2.c(dnr.C) && $$3.a() == eiq.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dnr.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cqm a(@Nullable ciu $$0, cxc $$1, ib $$2, dnb $$3) {
      if ($$3.c(dnr.C)) {
         $$1.a($$2, $$3.a(dnr.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cqm(cqp.qy);
      } else {
         return cqm.h;
      }
   }

   @Override
   default Optional<atx> av_() {
      return eiq.c.j();
   }
}
