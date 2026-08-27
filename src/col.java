import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface col {
   void a(@Nullable cvu<?> var1);

   @Nullable
   cvu<?> d();

   default void a(cka $$0, List<crs> $$1) {
      cvu<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(czg $$0, apv $$1, cvu<?> $$2) {
      if (!$$2.b().an_() && $$0.aa().b(czc.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
