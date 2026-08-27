import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dfl implements Predicate<dfd> {
   private final ctc a;

   public dfl(ctc $$0) {
      this.a = $$0;
   }

   public static dfl a(ctc $$0) {
      return new dfl($$0);
   }

   public boolean a(@Nullable dfd $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
