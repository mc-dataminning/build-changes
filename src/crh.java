import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface crh {
   void a(@Nullable cyv<?> var1);

   @Nullable
   cyv<?> d();

   default void a(cmv $$0, List<cun> $$1) {
      cyv<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dbw $$0, arf $$1, cyv<?> $$2) {
      if (!$$2.b().ao_() && $$0.ab().b(dbs.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
