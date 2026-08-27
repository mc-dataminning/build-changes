import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dcj implements Predicate<dcb> {
   private final cpn a;

   public dcj(cpn $$0) {
      this.a = $$0;
   }

   public static dcj a(cpn $$0) {
      return new dcj($$0);
   }

   public boolean a(@Nullable dcb $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
