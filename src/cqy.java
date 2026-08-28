import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cqy {
   void a(@Nullable cyl<?> var1);

   @Nullable
   cyl<?> d();

   default void a(cml $$0, List<cud> $$1) {
      cyl<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dcg $$0, aqn $$1, cyl<?> $$2) {
      if (!$$2.b().ao_() && $$0.ab().b(dcc.w) && !$$1.J().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
