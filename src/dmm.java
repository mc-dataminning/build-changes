import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dmm implements Predicate<dme> {
   private final czf a;

   public dmm(czf $$0) {
      this.a = $$0;
   }

   public static dmm a(czf $$0) {
      return new dmm($$0);
   }

   public boolean a(@Nullable dme $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
