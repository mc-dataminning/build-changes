import java.util.Optional;
import javax.annotation.Nullable;

public interface daz extends cuh, cyp {
   @Override
   default boolean a(@Nullable ccx $$0, cqf $$1, ht $$2, dgb $$3, ebd $$4) {
      return $$4 == ebf.c;
   }

   @Override
   default boolean a(cra $$0, ht $$1, dgb $$2, ebe $$3) {
      if (!$$2.c(dgr.C) && $$3.a() == ebf.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dgr.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default ckj a(@Nullable ccx $$0, cra $$1, ht $$2, dgb $$3) {
      if ($$3.c(dgr.C)) {
         $$1.a($$2, $$3.a(dgr.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new ckj(ckm.pL);
      } else {
         return ckj.b;
      }
   }

   @Override
   default Optional<aqc> at_() {
      return ebf.c.j();
   }
}
