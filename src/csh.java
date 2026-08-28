import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface csh {
   void a(@Nullable czv<?> var1);

   @Nullable
   czv<?> d();

   default void a(cnp $$0, List<cvl> $$1) {
      czv<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().ar_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(dds $$0, arh $$1, czv<?> $$2) {
      if (!$$2.b().ar_() && $$0.ac().b(ddo.w) && !$$1.K().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
