import java.util.Optional;
import javax.annotation.Nullable;

public interface dmc extends dfi, djs {
   @Override
   default boolean a(@Nullable cmz $$0, dbg $$1, iz $$2, dse $$3, enw $$4) {
      return $$4 == eny.c;
   }

   @Override
   default boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      if (!$$2.c(dsu.C) && $$3.a() == eny.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dsu.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cur a(@Nullable cmz $$0, dcb $$1, iz $$2, dse $$3) {
      if ($$3.c(dsu.C)) {
         $$1.a($$2, $$3.a(dsu.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cur(cuu.qz);
      } else {
         return cur.l;
      }
   }

   @Override
   default Optional<avz> ar_() {
      return eny.c.j();
   }
}
