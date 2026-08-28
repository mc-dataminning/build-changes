import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ebm implements Predicate<ebe> {
   private final dnc a;

   public ebm(dnc $$0) {
      this.a = $$0;
   }

   public static ebm a(dnc $$0) {
      return new ebm($$0);
   }

   public boolean a(@Nullable ebe $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
