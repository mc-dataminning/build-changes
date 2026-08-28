import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eap implements Predicate<eah> {
   private final dmf a;

   public eap(dmf $$0) {
      this.a = $$0;
   }

   public static eap a(dmf $$0) {
      return new eap($$0);
   }

   public boolean a(@Nullable eah $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
