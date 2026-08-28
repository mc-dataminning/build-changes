import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ctf {
   void a(@Nullable dar<?> var1);

   @Nullable
   dar<?> d();

   default void a(com $$0, List<cwb> $$1) {
      dar<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dfb $$0, aro $$1, dar<?> $$2) {
      if (!$$2.b().ap_() && $$0.ac().b(dex.w) && !$$1.K().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
