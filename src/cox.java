import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cox {
   void a(@Nullable cwi<?> var1);

   @Nullable
   cwi<?> d();

   default void a(ckl $$0, List<csd> $$1) {
      cwi<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(czu $$0, aqf $$1, cwi<?> $$2) {
      if (!$$2.b().an_() && $$0.aa().b(czq.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
