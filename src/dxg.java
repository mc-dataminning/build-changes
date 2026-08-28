import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxg implements Predicate<dwy> {
   private final djn a;

   public dxg(djn $$0) {
      this.a = $$0;
   }

   public static dxg a(djn $$0) {
      return new dxg($$0);
   }

   public boolean a(@Nullable dwy $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
