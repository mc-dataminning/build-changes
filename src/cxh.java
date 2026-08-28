import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cxh {
   void a(@Nullable deu<?> var1);

   @Nullable
   deu<?> d();

   default void a(crx $$0, List<czy> $$1) {
      deu<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(art $$0, deu<?> $$1) {
      if (!$$1.b().aq_() && $$0.y().O().c(djt.y) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
