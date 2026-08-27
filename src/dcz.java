import java.util.Optional;
import javax.annotation.Nullable;

public interface dcz extends cwg, dap {
   @Override
   default boolean a(@Nullable cer $$0, cse $$1, hv $$2, dip $$3, edy $$4) {
      return $$4 == eea.c;
   }

   @Override
   default boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      if (!$$2.c(djf.C) && $$3.a() == eea.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(djf.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cmh a(@Nullable cer $$0, csz $$1, hv $$2, dip $$3) {
      if ($$3.c(djf.C)) {
         $$1.a($$2, $$3.a(djf.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cmh(cmk.qw);
      } else {
         return cmh.f;
      }
   }

   @Override
   default Optional<arb> au_() {
      return eea.c.j();
   }
}
