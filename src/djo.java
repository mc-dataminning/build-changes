import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djo implements Predicate<djg> {
   private final cwp a;

   public djo(cwp $$0) {
      this.a = $$0;
   }

   public static djo a(cwp $$0) {
      return new djo($$0);
   }

   public boolean a(@Nullable djg $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
