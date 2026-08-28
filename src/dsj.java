import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsj implements Predicate<dsb> {
   private final dey a;

   public dsj(dey $$0) {
      this.a = $$0;
   }

   public static dsj a(dey $$0) {
      return new dsj($$0);
   }

   public boolean a(@Nullable dsb $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
