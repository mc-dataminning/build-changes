import java.util.Optional;
import javax.annotation.Nullable;

public interface dkz extends def, dip {
   @Override
   default boolean a(@Nullable clw $$0, dad $$1, io $$2, drb $$3, emt $$4) {
      return $$4 == emv.c;
   }

   @Override
   default boolean a(day $$0, io $$1, drb $$2, emu $$3) {
      if (!$$2.c(drr.C) && $$3.a() == emv.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(drr.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cto a(@Nullable clw $$0, day $$1, io $$2, drb $$3) {
      if ($$3.c(drr.C)) {
         $$1.a($$2, $$3.a(drr.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cto(ctr.qz);
      } else {
         return cto.i;
      }
   }

   @Override
   default Optional<avg> as_() {
      return emv.c.j();
   }
}
