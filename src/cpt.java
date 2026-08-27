import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cpt {
   void a(@Nullable cxf<?> var1);

   @Nullable
   cxf<?> d();

   default void a(clh $$0, List<csz> $$1) {
      cxf<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dad $$0, aqi $$1, cxf<?> $$2) {
      if (!$$2.b().an_() && $$0.aa().b(czz.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
