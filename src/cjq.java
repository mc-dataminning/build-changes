import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cjq {
   void a(@Nullable cqe<?> var1);

   @Nullable
   cqe<?> d();

   default void a(cfi $$0, List<cmy> $$1) {
      cqe<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(ctp $$0, ane $$1, cqe<?> $$2) {
      if (!$$2.b().aq_() && $$0.Z().b(ctl.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
