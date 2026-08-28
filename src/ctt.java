import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ctt {
   void a(@Nullable dbj<?> var1);

   @Nullable
   dbj<?> d();

   default void a(cox $$0, List<cwp> $$1) {
      dbj<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(ard $$0, dbj<?> $$1) {
      if (!$$1.b().ap_() && $$0.y().O().b(dge.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
