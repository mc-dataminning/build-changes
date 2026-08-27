import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpq implements Predicate<dpi> {
   private final dch a;

   public dpq(dch $$0) {
      this.a = $$0;
   }

   public static dpq a(dch $$0) {
      return new dpq($$0);
   }

   public boolean a(@Nullable dpi $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
