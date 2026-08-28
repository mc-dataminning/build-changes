import java.util.Optional;
import javax.annotation.Nullable;

public interface dlv extends dfb, djl {
   @Override
   default boolean a(@Nullable cms $$0, daz $$1, iz $$2, drx $$3, enp $$4) {
      return $$4 == enr.c;
   }

   @Override
   default boolean a(dbu $$0, iz $$1, drx $$2, enq $$3) {
      if (!$$2.c(dsn.C) && $$3.a() == enr.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dsn.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cuk a(@Nullable cms $$0, dbu $$1, iz $$2, drx $$3) {
      if ($$3.c(dsn.C)) {
         $$1.a($$2, $$3.a(dsn.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cuk(cun.qz);
      } else {
         return cuk.l;
      }
   }

   @Override
   default Optional<avv> at_() {
      return enr.c.j();
   }
}
