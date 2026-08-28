import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface crk {
   void a(@Nullable cyy<?> var1);

   @Nullable
   cyy<?> d();

   default void a(cmy $$0, List<cuq> $$1) {
      cyy<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dbz $$0, arg $$1, cyy<?> $$2) {
      if (!$$2.b().an_() && $$0.ab().b(dbv.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
