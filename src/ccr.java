import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ccr {
   void a(@Nullable cjc<?> var1);

   @Nullable
   cjc<?> d();

   default void a(byo $$0, List<cfz> $$1) {
      cjc<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.ai_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cmm $$0, aig $$1, cjc<?> $$2) {
      if (!$$2.ai_() && $$0.X().b(cmi.v) && !$$1.E().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
