import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cwb {
   void a(@Nullable ddo<?> var1);

   @Nullable
   ddo<?> d();

   default void a(cqs $$0, List<cys> $$1) {
      ddo<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().al_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(arp $$0, ddo<?> $$1) {
      if (!$$1.b().al_() && $$0.y().O().c(dil.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
