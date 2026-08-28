import java.util.Optional;
import javax.annotation.Nullable;

public interface dol extends dhq, dma {
   @Override
   default boolean a(@Nullable cnu $$0, ddl $$1, je $$2, duo $$3, eqo $$4) {
      return $$4 == eqq.c;
   }

   @Override
   default boolean a(deh $$0, je $$1, duo $$2, eqp $$3) {
      if (!$$2.c(dve.C) && $$3.a() == eqq.c) {
         if (!$$0.w_()) {
            $$0.a($$1, $$2.b(dve.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cvp a(@Nullable cnu $$0, deh $$1, je $$2, duo $$3) {
      if ($$3.c(dve.C)) {
         $$1.a($$2, $$3.b(dve.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cvp(cvt.qA);
      } else {
         return cvp.k;
      }
   }

   @Override
   default Optional<awd> at_() {
      return eqq.c.j();
   }
}
