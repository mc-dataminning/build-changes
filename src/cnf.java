import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cnf {
   void a(@Nullable ctr<?> var1);

   @Nullable
   ctr<?> d();

   default void a(ciu $$0, List<cqm> $$1) {
      ctr<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cxb $$0, apg $$1, ctr<?> $$2) {
      if (!$$2.b().aq_() && $$0.Z().b(cwx.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
