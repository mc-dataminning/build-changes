import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfm implements Predicate<dfe> {
   private final csq a;

   public dfm(csq $$0) {
      this.a = $$0;
   }

   public static dfm a(csq $$0) {
      return new dfm($$0);
   }

   public boolean a(@Nullable dfe $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
