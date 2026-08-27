import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dqp implements Predicate<dqh> {
   private final dde a;

   public dqp(dde $$0) {
      this.a = $$0;
   }

   public static dqp a(dde $$0) {
      return new dqp($$0);
   }

   public boolean a(@Nullable dqh $$0) {
      return $$0 != null && $$0.a(this.a);
   }
}
