import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface ctr {
   void a(@Nullable dbh<?> var1);

   @Nullable
   dbh<?> d();

   default void a(cov $$0, List<cwn> $$1) {
      dbh<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(ard $$0, dbh<?> $$1) {
      if (!$$1.b().ap_() && $$0.y().O().b(dgc.x) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
