import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eaw implements Predicate<eao> {
   private final dmm a;

   public eaw(dmm $$0) {
      this.a = $$0;
   }

   public static eaw a(dmm $$0) {
      return new eaw($$0);
   }

   public boolean a(@Nullable eao $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
