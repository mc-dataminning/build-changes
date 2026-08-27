import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cmj {
   void a(@Nullable csu<?> var1);

   @Nullable
   csu<?> d();

   default void a(cia $$0, List<cpq> $$1) {
      csu<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ar_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cwe $$0, apb $$1, csu<?> $$2) {
      if (!$$2.b().ar_() && $$0.Z().b(cwa.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
