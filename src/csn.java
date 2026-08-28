import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface csn {
   void a(@Nullable daj<?> var1);

   @Nullable
   daj<?> d();

   default void a(cnu $$0, List<cvp> $$1) {
      daj<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(deg $$0, ari $$1, daj<?> $$2) {
      if (!$$2.b().ap_() && $$0.ac().b(dec.w) && !$$1.K().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
