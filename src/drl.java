import java.util.function.Predicate;
import javax.annotation.Nullable;

public class drl implements Predicate<drd> {
   private final dea a;

   public drl(dea $$0) {
      this.a = $$0;
   }

   public static drl a(dea $$0) {
      return new drl($$0);
   }

   public boolean a(@Nullable drd $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
