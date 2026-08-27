import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bzm extends bzx<bpo> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.X);
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      if ($$1.bc()) {
         $$1.dP().a(byr.X, axy.a);
      } else {
         $$1.dP().b(byr.X);
      }
   }
}
