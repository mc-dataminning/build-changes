import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dtk implements Predicate<dtc> {
   private final dfy a;

   public dtk(dfy $$0) {
      this.a = $$0;
   }

   public static dtk a(dfy $$0) {
      return new dtk($$0);
   }

   public boolean a(@Nullable dtc $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
