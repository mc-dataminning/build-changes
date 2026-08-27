import java.util.Optional;
import javax.annotation.Nullable;

public interface dlb extends deh, dir {
   @Override
   default boolean a(@Nullable cly $$0, daf $$1, io $$2, drd $$3, emv $$4) {
      return $$4 == emx.c;
   }

   @Override
   default boolean a(dba $$0, io $$1, drd $$2, emw $$3) {
      if (!$$2.c(drt.C) && $$3.a() == emx.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(drt.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default ctq a(@Nullable cly $$0, dba $$1, io $$2, drd $$3) {
      if ($$3.c(drt.C)) {
         $$1.a($$2, $$3.a(drt.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new ctq(ctt.qz);
      } else {
         return ctq.i;
      }
   }

   @Override
   default Optional<avh> at_() {
      return emx.c.j();
   }
}
