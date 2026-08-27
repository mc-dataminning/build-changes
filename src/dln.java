import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dln implements Predicate<dlf> {
   private final cyo a;

   public dln(cyo $$0) {
      this.a = $$0;
   }

   public static dln a(cyo $$0) {
      return new dln($$0);
   }

   public boolean a(@Nullable dlf $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
