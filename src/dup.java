import java.util.Optional;
import javax.annotation.Nullable;

public interface dup extends dnm, dsb {
   @Override
   default boolean a(@Nullable bxw $$0, djd $$1, iw $$2, ebg $$3, exp $$4) {
      return $$4 == exr.c;
   }

   @Override
   default boolean a(dka $$0, iw $$1, ebg $$2, exq $$3) {
      if (!$$2.c(ebw.I) && $$3.a() == exr.c) {
         if (!$$0.A_()) {
            $$0.a($$1, $$2.b(ebw.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default daa a(@Nullable bxw $$0, dka $$1, iw $$2, ebg $$3) {
      if ($$3.c(ebw.I)) {
         $$1.a($$2, $$3.b(ebw.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new daa(dae.rp);
      } else {
         return daa.k;
      }
   }

   @Override
   default Optional<awq> at_() {
      return exr.c.j();
   }
}
