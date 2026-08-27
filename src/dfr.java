import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfr implements Predicate<dfj> {
   private final csv a;

   public dfr(csv $$0) {
      this.a = $$0;
   }

   public static dfr a(csv $$0) {
      return new dfr($$0);
   }

   public boolean a(@Nullable dfj $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
