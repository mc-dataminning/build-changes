import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cib {
   void a(@Nullable coq<?> var1);

   @Nullable
   coq<?> d();

   default void a(cdu $$0, List<clj> $$1) {
      coq<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(csa $$0, amf $$1, coq<?> $$2) {
      if (!$$2.b().ap_() && $$0.Y().b(crw.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
