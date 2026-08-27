import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cfx {
   void a(@Nullable cmk<?> var1);

   @Nullable
   cmk<?> d();

   default void a(cbu $$0, List<cjf> $$1) {
      cmk<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().am_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cpv $$0, akr $$1, cmk<?> $$2) {
      if (!$$2.b().am_() && $$0.X().b(cpr.v) && !$$1.G().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
