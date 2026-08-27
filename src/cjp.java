import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public interface cjp {
   void a(@Nullable cqd<?> var1);

   @Nullable
   cqd<?> d();

   default void a(cfh $$0, List<cmx> $$1) {
      cqd<?> $$2 = this.d();
      if ($$2 != null) {
         $$0.a($$2, $$1);
         if (!$$2.b().aq_()) {
            $$0.a(Collections.singleton($$2));
            this.a(null);
         }
      }
   }

   default boolean a(cto $$0, ane $$1, cqd<?> $$2) {
      if (!$$2.b().aq_() && $$0.Z().b(ctk.w) && !$$1.I().b($$2)) {
         return false;
      } else {
         this.a($$2);
         return true;
      }
   }
}
