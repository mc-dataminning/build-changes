import java.util.Optional;
import javax.annotation.Nullable;

public interface dfo extends cyv, dde {
   @Override
   default boolean a(@Nullable chh $$0, cut $$1, hz $$2, dlf $$3, ego $$4) {
      return $$4 == egq.c;
   }

   @Override
   default boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      if (!$$2.c(dlv.C) && $$3.a() == egq.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(dlv.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default coz a(@Nullable chh $$0, cvo $$1, hz $$2, dlf $$3) {
      if ($$3.c(dlv.C)) {
         $$1.a($$2, $$3.a(dlv.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new coz(cpc.qy);
      } else {
         return coz.h;
      }
   }

   @Override
   default Optional<atj> ax_() {
      return egq.c.j();
   }
}
