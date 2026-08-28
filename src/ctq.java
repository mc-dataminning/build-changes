import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ctq {
   void a(@Nullable dbc<?> var1);

   @Nullable
   dbc<?> d();

   default void a(cou $$0, List<cwm> $$1) {
      dbc<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(arq $$0, dbc<?> $$1) {
      if (!$$1.b().ao_() && $$0.y().N().b(dfi.w) && !$$0.J().b($$1)) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
