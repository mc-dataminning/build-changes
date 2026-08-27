import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cnd {
   void a(@Nullable ctp<?> var1);

   @Nullable
   ctp<?> d();

   default void a(cis $$0, List<cqk> $$1) {
      ctp<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cwz $$0, apg $$1, ctp<?> $$2) {
      if (!$$2.b().aq_() && $$0.Z().b(cwv.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
