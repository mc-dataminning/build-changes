import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfi implements Predicate<dfa> {
   private final csm a;

   public dfi(csm $$0) {
      this.a = $$0;
   }

   public static dfi a(csm $$0) {
      return new dfi($$0);
   }

   public boolean a(@Nullable dfa $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
