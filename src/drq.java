import java.util.Optional;
import javax.annotation.Nullable;

public interface drq extends dku, dpf {
   @Override
   default boolean a(@Nullable cpx $$0, dgn $$1, jh $$2, dxv $$3, etw $$4) {
      return $$4 == ety.c;
   }

   @Override
   default boolean a(dhj $$0, jh $$1, dxv $$2, etx $$3) {
      if (!$$2.c(dyl.D) && $$3.a() == ety.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dyl.D, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cxp a(@Nullable cpx $$0, dhj $$1, jh $$2, dxv $$3) {
      if ($$3.c(dyl.D)) {
         $$1.a($$2, $$3.b(dyl.D, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cxp(cxt.qX);
      } else {
         return cxp.j;
      }
   }

   @Override
   default Optional<axe> at_() {
      return ety.c.j();
   }
}
