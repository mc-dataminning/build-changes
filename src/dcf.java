import java.util.Optional;
import javax.annotation.Nullable;

public interface dcf extends cvm, czv {
   @Override
   default boolean a(@Nullable cdz $$0, crl $$1, hx $$2, dhn $$3, ecw $$4) {
      return $$4 == ecy.c;
   }

   @Override
   default boolean a(csg $$0, hx $$1, dhn $$2, ecx $$3) {
      if (!$$2.c(did.C) && $$3.a() == ecy.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(did.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default clo a(@Nullable cdz $$0, csg $$1, hx $$2, dhn $$3) {
      if ($$3.c(did.C)) {
         $$1.a($$2, $$3.a(did.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new clo(clr.qw);
      } else {
         return clo.b;
      }
   }

   @Override
   default Optional<aqu> av_() {
      return ecy.c.j();
   }
}
