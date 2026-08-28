import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cxj {
   void a(@Nullable dew<?> var1);

   @Nullable
   dew<?> d();

   default void a(crz $$0, List<daa> $$1) {
      dew<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(arv $$0, dew<?> $$1) {
      if (!$$1.b().aq_() && $$0.y().O().c(djv.y) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
