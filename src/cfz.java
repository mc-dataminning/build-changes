import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cfz {
   void a(@Nullable cmm<?> var1);

   @Nullable
   cmm<?> d();

   default void a(cbw $$0, List<cjh> $$1) {
      cmm<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().am_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cpx $$0, akt $$1, cmm<?> $$2) {
      if (!$$2.b().am_() && $$0.X().b(cpt.v) && !$$1.G().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
