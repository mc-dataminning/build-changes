import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cta {
   void a(@Nullable dal<?> var1);

   @Nullable
   dal<?> d();

   default void a(coh $$0, List<cvx> $$1) {
      dal<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dev $$0, arn $$1, dal<?> $$2) {
      if (!$$2.b().aq_() && $$0.ac().b(der.w) && !$$1.K().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
