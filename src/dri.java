import java.util.Optional;
import javax.annotation.Nullable;

public interface dri extends dkm, dox {
   @Override
   default boolean a(@Nullable cps $$0, dgf $$1, jh $$2, dxn $$3, eto $$4) {
      return $$4 == etq.c;
   }

   @Override
   default boolean a(dhb $$0, jh $$1, dxn $$2, etp $$3) {
      if (!$$2.c(dyd.D) && $$3.a() == etq.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dyd.D, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cxk a(@Nullable cps $$0, dhb $$1, jh $$2, dxn $$3) {
      if ($$3.c(dyd.D)) {
         $$1.a($$2, $$3.b(dyd.D, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cxk(cxo.qX);
      } else {
         return cxk.k;
      }
   }

   @Override
   default Optional<axe> at_() {
      return etq.c.j();
   }
}
