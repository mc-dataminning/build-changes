import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cjj {
   void a(@Nullable cpx<?> var1);

   @Nullable
   cpx<?> d();

   default void a(cfb $$0, List<cmr> $$1) {
      cpx<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cti $$0, ana $$1, cpx<?> $$2) {
      if (!$$2.b().aq_() && $$0.Z().b(cte.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
