import java.util.Optional;
import javax.annotation.Nullable;

public interface dlz extends dff, djp {
   @Override
   default boolean a(@Nullable cmw $$0, dbd $$1, iz $$2, dsb $$3, ent $$4) {
      return $$4 == env.c;
   }

   @Override
   default boolean a(dby $$0, iz $$1, dsb $$2, enu $$3) {
      if (!$$2.c(dsr.C) && $$3.a() == env.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dsr.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cuo a(@Nullable cmw $$0, dby $$1, iz $$2, dsb $$3) {
      if ($$3.c(dsr.C)) {
         $$1.a($$2, $$3.a(dsr.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cuo(cur.qz);
      } else {
         return cuo.l;
      }
   }

   @Override
   default Optional<avy> ar_() {
      return env.c.j();
   }
}
