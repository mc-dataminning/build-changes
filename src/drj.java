import java.util.function.Predicate;
import javax.annotation.Nullable;

public class drj implements Predicate<drb> {
   private final ddy a;

   public drj(ddy $$0) {
      this.a = $$0;
   }

   public static drj a(ddy $$0) {
      return new drj($$0);
   }

   public boolean a(@Nullable drb $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
