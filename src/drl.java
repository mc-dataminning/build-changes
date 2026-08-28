import java.util.Optional;
import javax.annotation.Nullable;

public interface drl extends dkm, doz {
   @Override
   default boolean a(@Nullable bvy $$0, dgf $$1, ji $$2, dxq $$3, etv $$4) {
      return $$4 == etx.c;
   }

   @Override
   default boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      if (!$$2.c(dyg.I) && $$3.a() == etx.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(dyg.I, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cxh a(@Nullable bvy $$0, dha $$1, ji $$2, dxq $$3) {
      if ($$3.c(dyg.I)) {
         $$1.a($$2, $$3.b(dyg.I, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cxh(cxl.ri);
      } else {
         return cxh.k;
      }
   }

   @Override
   default Optional<avz> as_() {
      return etx.c.j();
   }
}
