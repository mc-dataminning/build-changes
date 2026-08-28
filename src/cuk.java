import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cuk {
   void a(@Nullable dca<?> var1);

   @Nullable
   dca<?> d();

   default void a(cpo $$0, List<cxg> $$1) {
      dca<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(ary $$0, dca<?> $$1) {
      if (!$$1.b().aq_() && $$0.y().O().b(dgv.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
