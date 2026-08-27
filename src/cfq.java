import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cfq {
   void a(@Nullable cmb<?> var1);

   @Nullable
   cmb<?> d();

   default void a(cbn $$0, List<ciy> $$1) {
      cmb<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.ai_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cpm $$0, akl $$1, cmb<?> $$2) {
      if (!$$2.ai_() && $$0.X().b(cpi.v) && !$$1.F().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
