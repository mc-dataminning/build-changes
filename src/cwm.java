import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cwm {
   void a(@Nullable ddz<?> var1);

   @Nullable
   ddz<?> d();

   default void a(crc $$0, List<czd> $$1) {
      ddz<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().am_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(arr $$0, ddz<?> $$1) {
      if (!$$1.b().am_() && $$0.y().O().c(diw.y) && !$$0.J().b($$1.a())) {
         return false;
      } else {
         this.a($$1);
         return true;
      }
   }
}
