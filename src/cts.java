import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cts {
   void a(@Nullable dbi<?> var1);

   @Nullable
   dbi<?> d();

   default void a(cow $$0, List<cwo> $$1) {
      dbi<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(are $$0, dbi<?> $$1) {
      if (!$$1.b().ap_() && $$0.y().O().b(dgd.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
