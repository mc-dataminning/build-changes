import java.util.Optional;
import javax.annotation.Nullable;

public interface drp extends dkt, dpe {
   @Override
   default boolean a(@Nullable cpw $$0, dgm $$1, jh $$2, dxu $$3, etv $$4) {
      return $$4 == etx.c;
   }

   @Override
   default boolean a(dhi $$0, jh $$1, dxu $$2, etw $$3) {
      if (!$$2.c(dyk.D) && $$3.a() == etx.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dyk.D, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cxo a(@Nullable cpw $$0, dhi $$1, jh $$2, dxu $$3) {
      if ($$3.c(dyk.D)) {
         $$1.a($$2, $$3.b(dyk.D, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cxo(cxs.qX);
      } else {
         return cxo.k;
      }
   }

   @Override
   default Optional<axe> at_() {
      return etx.c.j();
   }
}
