import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cgd {
   void a(@Nullable cmq<?> var1);

   @Nullable
   cmq<?> d();

   default void a(cca $$0, List<cjl> $$1) {
      cmq<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().am_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cqb $$0, aku $$1, cmq<?> $$2) {
      if (!$$2.b().am_() && $$0.X().b(cpx.v) && !$$1.G().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
