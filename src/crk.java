import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface crk {
   void a(@Nullable czb<?> var1);

   @Nullable
   czb<?> d();

   default void a(cmx $$0, List<cuq> $$1) {
      czb<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().as_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dcw $$0, aqv $$1, czb<?> $$2) {
      if (!$$2.b().as_() && $$0.ab().b(dcs.w) && !$$1.J().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
