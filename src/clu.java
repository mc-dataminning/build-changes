import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface clu {
   void a(@Nullable csh<?> var1);

   @Nullable
   csh<?> d();

   default void a(chl $$0, List<cpd> $$1) {
      csh<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().as_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cvr $$0, aox $$1, csh<?> $$2) {
      if (!$$2.b().as_() && $$0.Z().b(cvn.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
