import java.util.Optional;
import javax.annotation.Nullable;

public interface czr extends csw, cxe {
   @Override
   default boolean a(@Nullable cbp $$0, cow $$1, gw $$2, dfe $$3, eag $$4) {
      return $$4 == eai.c;
   }

   @Override
   default boolean a(cpr $$0, gw $$1, dfe $$2, eah $$3) {
      if (!$$2.c(dfu.C) && $$3.a() == eai.c) {
         if (!$$0.r_()) {
            $$0.a($$1, $$2.a(dfu.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cja a(@Nullable cbp $$0, cpr $$1, gw $$2, dfe $$3) {
      if ($$3.c(dfu.C)) {
         $$1.a($$2, $$3.a(dfu.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cja(cjd.pL);
      } else {
         return cja.b;
      }
   }

   @Override
   default Optional<aoy> al_() {
      return eai.c.j();
   }
}
