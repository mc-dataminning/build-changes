import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ciz {
   void a(@Nullable cpn<?> var1);

   @Nullable
   cpn<?> d();

   default void a(cer $$0, List<cmh> $$1) {
      cpn<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(csy $$0, amq $$1, cpn<?> $$2) {
      if (!$$2.b().aq_() && $$0.Y().b(csu.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
