import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cqk {
   void a(@Nullable cxy<?> var1);

   @Nullable
   cxy<?> d();

   default void a(cly $$0, List<ctq> $$1) {
      cxy<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ao_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(daz $$0, aqo $$1, cxy<?> $$2) {
      if (!$$2.b().ao_() && $$0.aa().b(dav.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
