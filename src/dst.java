import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dst implements Predicate<dsl> {
   private final dfi a;

   public dst(dfi $$0) {
      this.a = $$0;
   }

   public static dst a(dfi $$0) {
      return new dst($$0);
   }

   public boolean a(@Nullable dsl $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
