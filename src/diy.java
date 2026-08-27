import java.util.Optional;
import javax.annotation.Nullable;

public interface diy extends dcf, dgo {
   @Override
   default boolean a(@Nullable cjt $$0, cyd $$1, ib $$2, doz $$3, ekr $$4) {
      return $$4 == ekt.c;
   }

   @Override
   default boolean a(cyy $$0, ib $$1, doz $$2, eks $$3) {
      if (!$$2.c(dpp.C) && $$3.a() == ekt.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dpp.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default crj a(@Nullable cjt $$0, cyy $$1, ib $$2, doz $$3) {
      if ($$3.c(dpp.C)) {
         $$1.a($$2, $$3.a(dpp.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new crj(crm.qy);
      } else {
         return crj.i;
      }
   }

   @Override
   default Optional<aul> at_() {
      return ekt.c.j();
   }
}
