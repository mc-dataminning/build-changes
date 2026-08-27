import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cqi {
   void a(@Nullable cxw<?> var1);

   @Nullable
   cxw<?> d();

   default void a(clw $$0, List<cto> $$1) {
      cxw<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().an_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dax $$0, aqn $$1, cxw<?> $$2) {
      if (!$$2.b().an_() && $$0.aa().b(dat.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
