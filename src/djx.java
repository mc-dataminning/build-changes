import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djx implements Predicate<djp> {
   private final cwy a;

   public djx(cwy $$0) {
      this.a = $$0;
   }

   public static djx a(cwy $$0) {
      return new djx($$0);
   }

   public boolean a(@Nullable djp $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
