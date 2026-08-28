import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsi implements Predicate<dsa> {
   private final dex a;

   public dsi(dex $$0) {
      this.a = $$0;
   }

   public static dsi a(dex $$0) {
      return new dsi($$0);
   }

   public boolean a(@Nullable dsa $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
