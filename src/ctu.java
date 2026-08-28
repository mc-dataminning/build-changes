import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ctu {
   void a(@Nullable dbk<?> var1);

   @Nullable
   dbk<?> d();

   default void a(coy $$0, List<cwq> $$1) {
      dbk<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(are $$0, dbk<?> $$1) {
      if (!$$1.b().ap_() && $$0.y().O().b(dgf.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
