import java.util.Optional;
import javax.annotation.Nullable;

public interface dca extends cvh, czq {
   @Override
   default boolean a(@Nullable cdu $$0, crg $$1, ht $$2, dhi $$3, ecr $$4) {
      return $$4 == ect.c;
   }

   @Override
   default boolean a(csb $$0, ht $$1, dhi $$2, ecs $$3) {
      if (!$$2.c(dhy.C) && $$3.a() == ect.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dhy.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default clj a(@Nullable cdu $$0, csb $$1, ht $$2, dhi $$3) {
      if ($$3.c(dhy.C)) {
         $$1.a($$2, $$3.a(dhy.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new clj(clm.qw);
      } else {
         return clj.b;
      }
   }

   @Override
   default Optional<aqq> at_() {
      return ect.c.j();
   }
}
