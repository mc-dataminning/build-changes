import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface coe {
   void a(@Nullable cvl<?> var1);

   @Nullable
   cvl<?> d();

   default void a(cjt $$0, List<crj> $$1) {
      cvl<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cyx $$0, apt $$1, cvl<?> $$2) {
      if (!$$2.b().ao_() && $$0.aa().b(cyt.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
