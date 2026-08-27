import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cfp {
   void a(@Nullable cma<?> var1);

   @Nullable
   cma<?> d();

   default void a(cbm $$0, List<cix> $$1) {
      cma<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.ah_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cpl $$0, akl $$1, cma<?> $$2) {
      if (!$$2.ah_() && $$0.X().b(cph.v) && !$$1.F().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
