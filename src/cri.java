import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cri {
   void a(@Nullable cyw<?> var1);

   @Nullable
   cyw<?> d();

   default void a(cmw $$0, List<cuo> $$1) {
      cyw<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dbx $$0, arf $$1, cyw<?> $$2) {
      if (!$$2.b().an_() && $$0.ab().b(dbt.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
