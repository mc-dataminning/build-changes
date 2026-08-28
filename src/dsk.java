import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsk implements Predicate<dsc> {
   private final dez a;

   public dsk(dez $$0) {
      this.a = $$0;
   }

   public static dsk a(dez $$0) {
      return new dsk($$0);
   }

   public boolean a(@Nullable dsc $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
