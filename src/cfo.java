import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cfo {
   void a(@Nullable clz<?> var1);

   @Nullable
   clz<?> d();

   default void a(cbl $$0, List<ciw> $$1) {
      clz<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.ai_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cpk $$0, akj $$1, clz<?> $$2) {
      if (!$$2.ai_() && $$0.X().b(cpg.v) && !$$1.F().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
