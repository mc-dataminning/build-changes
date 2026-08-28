import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsm implements Predicate<dse> {
   private final dfb a;

   public dsm(dfb $$0) {
      this.a = $$0;
   }

   public static dsm a(dfb $$0) {
      return new dsm($$0);
   }

   public boolean a(@Nullable dse $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
