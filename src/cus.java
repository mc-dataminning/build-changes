import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cus {
   void a(@Nullable dci<?> var1);

   @Nullable
   dci<?> d();

   default void a(cpw $$0, List<cxo> $$1) {
      dci<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(asi $$0, dci<?> $$1) {
      if (!$$1.b().aq_() && $$0.y().N().b(dhd.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
