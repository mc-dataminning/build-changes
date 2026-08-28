import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cwt {
   void a(@Nullable deg<?> var1);

   @Nullable
   deg<?> d();

   default void a(crj $$0, List<czk> $$1) {
      deg<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().am_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(arr $$0, deg<?> $$1) {
      if (!$$1.b().am_() && $$0.y().O().c(djd.y) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
