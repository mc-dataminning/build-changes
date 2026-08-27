import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dtk implements Predicate<dtc> {
   private final dfc a;

   public dtk(dfc $$0) {
      this.a = $$0;
   }

   public static dtk a(dfc $$0) {
      return new dtk($$0);
   }

   public boolean a(@Nullable dtc $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
