import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqg implements Predicate<dpy> {
   private final dcv a;

   public dqg(dcv $$0) {
      this.a = $$0;
   }

   public static dqg a(dcv $$0) {
      return new dqg($$0);
   }

   public boolean a(@Nullable dpy $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
