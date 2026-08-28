import java.util.Optional;
import javax.annotation.Nullable;

public interface dly extends dfe, djo {
   @Override
   default boolean a(@Nullable cmv $$0, dbc $$1, iz $$2, dsa $$3, ens $$4) {
      return $$4 == enu.c;
   }

   @Override
   default boolean a(dbx $$0, iz $$1, dsa $$2, ent $$3) {
      if (!$$2.c(dsq.C) && $$3.a() == enu.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dsq.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cun a(@Nullable cmv $$0, dbx $$1, iz $$2, dsa $$3) {
      if ($$3.c(dsq.C)) {
         $$1.a($$2, $$3.a(dsq.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cun(cuq.qz);
      } else {
         return cun.l;
      }
   }

   @Override
   default Optional<avy> as_() {
      return enu.c.j();
   }
}
