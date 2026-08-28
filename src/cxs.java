import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cxs {
   void a(@Nullable dfg<?> var1);

   @Nullable
   dfg<?> d();

   default void a(csi $$0, List<dak> $$1) {
      dfg<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().am_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(asc $$0, dfg<?> $$1) {
      if (!$$1.b().am_() && $$0.x().O().c(dkf.y) && !$$0.I().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
