import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface csq {
   void a(@Nullable dam<?> var1);

   @Nullable
   dam<?> d();

   default void a(cnx $$0, List<cvs> $$1) {
      dam<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dej $$0, ark $$1, dam<?> $$2) {
      if (!$$2.b().aq_() && $$0.ac().b(def.w) && !$$1.K().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
