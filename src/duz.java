import java.util.Optional;
import javax.annotation.Nullable;

public interface duz extends dnw, dsl {
   @Override
   default boolean a(@Nullable byf $$0, djn $$1, iw $$2, ebq $$3, exz $$4) {
      return $$4 == eyb.c;
   }

   @Override
   default boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      if (!$$2.c(ecg.I) && $$3.a() == eyb.c) {
         if (!$$0.A_()) {
            $$0.a($$1, $$2.b(ecg.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default dak a(@Nullable byf $$0, dkk $$1, iw $$2, ebq $$3) {
      if ($$3.c(ecg.I)) {
         $$1.a($$2, $$3.b(ecg.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new dak(dao.rp);
      } else {
         return dak.l;
      }
   }

   @Override
   default Optional<awx> ap_() {
      return eyb.c.j();
   }
}
