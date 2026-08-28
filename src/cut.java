import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cut {
   void a(@Nullable dcj<?> var1);

   @Nullable
   dcj<?> d();

   default void a(cpx $$0, List<cxp> $$1) {
      dcj<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(asi $$0, dcj<?> $$1) {
      if (!$$1.b().aq_() && $$0.y().N().b(dhe.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
