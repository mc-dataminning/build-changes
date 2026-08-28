import java.util.Optional;
import javax.annotation.Nullable;

public interface drj extends dkl, dow {
   @Override
   default boolean a(@Nullable cpo $$0, dge $$1, jh $$2, dxo $$3, etp $$4) {
      return $$4 == etr.c;
   }

   @Override
   default boolean a(dha $$0, jh $$1, dxo $$2, etq $$3) {
      if (!$$2.c(dye.J) && $$3.a() == etr.c) {
         if (!$$0.B_()) {
            $$0.a($$1, $$2.b(dye.J, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cxg a(@Nullable cpo $$0, dha $$1, jh $$2, dxo $$3) {
      if ($$3.c(dye.J)) {
         $$1.a($$2, $$3.b(dye.J, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cxg(cxk.rg);
      } else {
         return cxg.j;
      }
   }

   @Override
   default Optional<awu> at_() {
      return etr.c.j();
   }
}
