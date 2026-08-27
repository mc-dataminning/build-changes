import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlr implements Predicate<dlj> {
   private final cys a;

   public dlr(cys $$0) {
      this.a = $$0;
   }

   public static dlr a(cys $$0) {
      return new dlr($$0);
   }

   public boolean a(@Nullable dlj $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
