import java.util.Optional;
import javax.annotation.Nullable;

public interface dtq extends dmn, drc {
   @Override
   default boolean a(@Nullable bxe $$0, dig $$1, iu $$2, eah $$3, ewn $$4) {
      return $$4 == ewp.c;
   }

   @Override
   default boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      if (!$$2.c(eax.I) && $$3.a() == ewp.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(eax.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default czd a(@Nullable bxe $$0, djb $$1, iu $$2, eah $$3) {
      if ($$3.c(eax.I)) {
         $$1.a($$2, $$3.b(eax.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new czd(czh.rp);
      } else {
         return czd.k;
      }
   }

   @Override
   default Optional<awm> ap_() {
      return ewp.c.j();
   }
}
