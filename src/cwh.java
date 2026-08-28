import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cwh {
   void a(@Nullable ddu<?> var1);

   @Nullable
   ddu<?> d();

   default void a(cqy $$0, List<cyy> $$1) {
      ddu<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().al_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(arr $$0, ddu<?> $$1) {
      if (!$$1.b().al_() && $$0.y().O().c(dir.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
