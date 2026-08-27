import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dnj implements Predicate<dnb> {
   private final dac a;

   public dnj(dac $$0) {
      this.a = $$0;
   }

   public static dnj a(dac $$0) {
      return new dnj($$0);
   }

   public boolean a(@Nullable dnb $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
