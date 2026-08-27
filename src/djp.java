import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djp implements Predicate<djh> {
   private final cwq a;

   public djp(cwq $$0) {
      this.a = $$0;
   }

   public static djp a(cwq $$0) {
      return new djp($$0);
   }

   public boolean a(@Nullable djh $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
