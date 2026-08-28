import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cve {
   void a(@Nullable dcq<?> var1);

   @Nullable
   dcq<?> d();

   default void a(cqi $$0, List<cxy> $$1) {
      dcq<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().al_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(aro $$0, dcq<?> $$1) {
      if (!$$1.b().al_() && $$0.y().O().c(dhl.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
