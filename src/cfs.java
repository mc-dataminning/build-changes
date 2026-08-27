import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cfs {
   void a(@Nullable cmf<?> var1);

   @Nullable
   cmf<?> d();

   default void a(cbp $$0, List<cja> $$1) {
      cmf<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ah_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cpq $$0, ako $$1, cmf<?> $$2) {
      if (!$$2.b().ah_() && $$0.X().b(cpm.v) && !$$1.F().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
