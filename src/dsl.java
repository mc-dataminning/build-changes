import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsl implements Predicate<dsd> {
   private final dfa a;

   public dsl(dfa $$0) {
      this.a = $$0;
   }

   public static dsl a(dfa $$0) {
      return new dsl($$0);
   }

   public boolean a(@Nullable dsd $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
