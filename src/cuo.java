import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cuo {
   void a(@Nullable dcd<?> var1);

   @Nullable
   dcd<?> d();

   default void a(cps $$0, List<cxk> $$1) {
      dcd<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(asi $$0, dcd<?> $$1) {
      if (!$$1.b().aq_() && $$0.y().N().b(dgw.w) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
