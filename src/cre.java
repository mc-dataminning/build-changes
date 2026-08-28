import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cre {
   void a(@Nullable cys<?> var1);

   @Nullable
   cys<?> d();

   default void a(cms $$0, List<cuk> $$1) {
      cys<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dbt $$0, arc $$1, cys<?> $$2) {
      if (!$$2.b().ao_() && $$0.ab().b(dbp.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
