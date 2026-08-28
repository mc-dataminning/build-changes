import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cri {
   void a(@Nullable cyz<?> var1);

   @Nullable
   cyz<?> d();

   default void a(cmv $$0, List<cuo> $$1) {
      cyz<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dcu $$0, aqu $$1, cyz<?> $$2) {
      if (!$$2.b().ao_() && $$0.ab().b(dcq.w) && !$$1.J().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
