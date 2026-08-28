import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ctj {
   void a(@Nullable dav<?> var1);

   @Nullable
   dav<?> d();

   default void a(cor $$0, List<cwf> $$1) {
      dav<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dff $$0, arr $$1, dav<?> $$2) {
      if (!$$2.b().ap_() && $$0.ac().b(dfb.w) && !$$1.K().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
