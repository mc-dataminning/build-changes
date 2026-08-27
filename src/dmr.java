import java.util.Optional;
import javax.annotation.Nullable;

public interface dmr extends dfj, djx {
   @Override
   default boolean a(@Nullable cly $$0, dbg $$1, ir $$2, dtc $$3, epd $$4) {
      return $$4 == epf.c;
   }

   @Override
   default boolean a(dcb $$0, ir $$1, dtc $$2, epe $$3) {
      if (!$$2.c(dts.C) && $$3.a() == epf.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dts.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cuh a(@Nullable cly $$0, dcb $$1, ir $$2, dtc $$3) {
      if ($$3.c(dts.C)) {
         $$1.a($$2, $$3.a(dts.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cuh(cuk.rW);
      } else {
         return cuh.i;
      }
   }

   @Override
   default Optional<avn> as_() {
      return epf.c.j();
   }
}
