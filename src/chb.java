import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface chb {
   void a(@Nullable cno<?> var1);

   @Nullable
   cno<?> d();

   default void a(ccx $$0, List<ckj> $$1) {
      cno<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ap_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cqz $$0, alr $$1, cno<?> $$2) {
      if (!$$2.b().ap_() && $$0.X().b(cqv.v) && !$$1.G().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
