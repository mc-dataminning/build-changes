import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cjy {
   void a(@Nullable cqm<?> var1);

   @Nullable
   cqm<?> d();

   default void a(cfq $$0, List<cng> $$1) {
      cqm<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().as_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(ctx $$0, anf $$1, cqm<?> $$2) {
      if (!$$2.b().as_() && $$0.Z().b(ctt.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
