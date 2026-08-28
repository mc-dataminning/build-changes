import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvw implements Predicate<dvo> {
   private final dij a;

   public dvw(dij $$0) {
      this.a = $$0;
   }

   public static dvw a(dij $$0) {
      return new dvw($$0);
   }

   public boolean a(@Nullable dvo $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
