import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dti implements Predicate<dta> {
   private final dfw a;

   public dti(dfw $$0) {
      this.a = $$0;
   }

   public static dti a(dfw $$0) {
      return new dti($$0);
   }

   public boolean a(@Nullable dta $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
