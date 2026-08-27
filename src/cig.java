import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cig {
   void a(@Nullable cov<?> var1);

   @Nullable
   cov<?> d();

   default void a(cdz $$0, List<clo> $$1) {
      cov<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ar_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(csf $$0, amj $$1, cov<?> $$2) {
      if (!$$2.b().ar_() && $$0.Y().b(csb.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
