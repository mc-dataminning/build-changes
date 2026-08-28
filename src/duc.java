import java.util.Optional;
import javax.annotation.Nullable;

public interface duc extends dmz, dro {
   @Override
   default boolean a(@Nullable bxj $$0, diq $$1, iv $$2, eat $$3, ewz $$4) {
      return $$4 == exb.c;
   }

   @Override
   default boolean a(djn $$0, iv $$1, eat $$2, exa $$3) {
      if (!$$2.c(ebj.I) && $$3.a() == exb.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(ebj.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default czn a(@Nullable bxj $$0, djn $$1, iv $$2, eat $$3) {
      if ($$3.c(ebj.I)) {
         $$1.a($$2, $$3.b(ebj.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new czn(czr.rp);
      } else {
         return czn.k;
      }
   }

   @Override
   default Optional<awm> ap_() {
      return exb.c.j();
   }
}
