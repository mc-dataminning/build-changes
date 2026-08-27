import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dgj implements Predicate<dgb> {
   private final cua a;

   public dgj(cua $$0) {
      this.a = $$0;
   }

   public static dgj a(cua $$0) {
      return new dgj($$0);
   }

   public boolean a(@Nullable dgb $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
