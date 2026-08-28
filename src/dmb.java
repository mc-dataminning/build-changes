import java.util.Optional;
import javax.annotation.Nullable;

public interface dmb extends dfh, djr {
   @Override
   default boolean a(@Nullable cmy $$0, dbf $$1, iz $$2, dsd $$3, env $$4) {
      return $$4 == enx.c;
   }

   @Override
   default boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      if (!$$2.c(dst.C) && $$3.a() == enx.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dst.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cuq a(@Nullable cmy $$0, dca $$1, iz $$2, dsd $$3) {
      if ($$3.c(dst.C)) {
         $$1.a($$2, $$3.a(dst.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cuq(cut.qz);
      } else {
         return cuq.l;
      }
   }

   @Override
   default Optional<avz> ar_() {
      return enx.c.j();
   }
}
