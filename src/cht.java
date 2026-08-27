import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cht {
   void a(@Nullable coh<?> var1);

   @Nullable
   coh<?> d();

   default void a(cdm $$0, List<clb> $$1) {
      coh<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(crs $$0, amb $$1, coh<?> $$2) {
      if (!$$2.b().ap_() && $$0.X().b(cro.w) && !$$1.G().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
