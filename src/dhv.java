import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dhv implements Predicate<dhn> {
   private final cvf a;

   public dhv(cvf $$0) {
      this.a = $$0;
   }

   public static dhv a(cvf $$0) {
      return new dhv($$0);
   }

   public boolean a(@Nullable dhn $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
