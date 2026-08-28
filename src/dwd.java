import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dwd implements Predicate<dvv> {
   private final diq a;

   public dwd(diq $$0) {
      this.a = $$0;
   }

   public static dwd a(diq $$0) {
      return new dwd($$0);
   }

   public boolean a(@Nullable dvv $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
