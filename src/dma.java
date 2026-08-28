import java.util.Optional;
import javax.annotation.Nullable;

public interface dma extends dfg, djq {
   @Override
   default boolean a(@Nullable cmx $$0, dbe $$1, iz $$2, dsc $$3, enu $$4) {
      return $$4 == enw.c;
   }

   @Override
   default boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      if (!$$2.c(dss.C) && $$3.a() == enw.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dss.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cup a(@Nullable cmx $$0, dbz $$1, iz $$2, dsc $$3) {
      if ($$3.c(dss.C)) {
         $$1.a($$2, $$3.a(dss.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cup(cus.qz);
      } else {
         return cup.l;
      }
   }

   @Override
   default Optional<avz> ar_() {
      return enw.c.j();
   }
}
