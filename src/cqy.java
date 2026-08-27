import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cqy {
   void a(@Nullable czc<?> var1);

   @Nullable
   czc<?> d();

   default void a(cly $$0, List<cuh> $$1) {
      czc<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dca $$0, aqu $$1, czc<?> $$2) {
      if (!$$2.b().an_() && $$0.ab().b(dbw.w) && !$$1.K().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
