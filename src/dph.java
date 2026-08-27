import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dph implements Predicate<doz> {
   private final dby a;

   public dph(dby $$0) {
      this.a = $$0;
   }

   public static dph a(dby $$0) {
      return new dph($$0);
   }

   public boolean a(@Nullable doz $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
