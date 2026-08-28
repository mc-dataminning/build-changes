import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dyu implements Predicate<dym> {
   private final dku a;

   public dyu(dku $$0) {
      this.a = $$0;
   }

   public static dyu a(dku $$0) {
      return new dyu($$0);
   }

   public boolean a(@Nullable dym $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
