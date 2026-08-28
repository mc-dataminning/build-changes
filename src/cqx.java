import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cqx {
   void a(@Nullable cyk<?> var1);

   @Nullable
   cyk<?> d();

   default void a(cmk $$0, List<cuc> $$1) {
      cyk<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dcf $$0, aqn $$1, cyk<?> $$2) {
      if (!$$2.b().ao_() && $$0.ab().b(dcb.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
