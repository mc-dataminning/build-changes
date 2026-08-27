import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface clq {
   void a(@Nullable csd<?> var1);

   @Nullable
   csd<?> d();

   default void a(chh $$0, List<coz> $$1) {
      csd<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().as_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cvn $$0, aow $$1, csd<?> $$2) {
      if (!$$2.b().as_() && $$0.Z().b(cvj.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
