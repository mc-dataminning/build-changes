import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsp implements Predicate<dsh> {
   private final dff a;

   public dsp(dff $$0) {
      this.a = $$0;
   }

   public static dsp a(dff $$0) {
      return new dsp($$0);
   }

   public boolean a(@Nullable dsh $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
