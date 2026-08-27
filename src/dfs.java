import java.util.Optional;
import javax.annotation.Nullable;

public interface dfs extends cyz, ddi {
   @Override
   default boolean a(@Nullable chl $$0, cux $$1, hz $$2, dlj $$3, egv $$4) {
      return $$4 == egx.c;
   }

   @Override
   default boolean a(cvs $$0, hz $$1, dlj $$2, egw $$3) {
      if (!$$2.c(dlz.C) && $$3.a() == egx.c) {
         if (!$$0.y_()) {
            $$0.a($$1, $$2.a(dlz.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cpd a(@Nullable chl $$0, cvs $$1, hz $$2, dlj $$3) {
      if ($$3.c(dlz.C)) {
         $$1.a($$2, $$3.a(dlz.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cpd(cpg.qy);
      } else {
         return cpd.h;
      }
   }

   @Override
   default Optional<atk> ax_() {
      return egx.c.j();
   }
}
