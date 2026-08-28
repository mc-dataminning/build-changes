import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface crl {
   void a(@Nullable cyz<?> var1);

   @Nullable
   cyz<?> d();

   default void a(cmz $$0, List<cur> $$1) {
      cyz<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dca $$0, arg $$1, cyz<?> $$2) {
      if (!$$2.b().an_() && $$0.ab().b(dbw.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
