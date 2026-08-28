import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvr implements Predicate<dvj> {
   private final die a;

   public dvr(die $$0) {
      this.a = $$0;
   }

   public static dvr a(die $$0) {
      return new dvr($$0);
   }

   public boolean a(@Nullable dvj $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
