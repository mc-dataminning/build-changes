import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cww {
   void a(@Nullable dej<?> var1);

   @Nullable
   dej<?> d();

   default void a(crm $$0, List<czn> $$1) {
      dej<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().am_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(arr $$0, dej<?> $$1) {
      if (!$$1.b().am_() && $$0.y().O().c(dji.y) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
