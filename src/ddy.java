import java.util.Optional;
import javax.annotation.Nullable;

public interface ddy extends cxf, dbo {
   @Override
   default boolean a(@Nullable cfq $$0, ctd $$1, hx $$2, djp $$3, eey $$4) {
      return $$4 == efa.c;
   }

   @Override
   default boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      if (!$$2.c(dkf.C) && $$3.a() == efa.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(dkf.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cng a(@Nullable cfq $$0, cty $$1, hx $$2, djp $$3) {
      if ($$3.c(dkf.C)) {
         $$1.a($$2, $$3.a(dkf.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cng(cnj.qy);
      } else {
         return cng.f;
      }
   }

   @Override
   default Optional<ars> ax_() {
      return efa.c.j();
   }
}
