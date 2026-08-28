import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ced extends ceo<buf> {
   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.X);
   }

   @Override
   protected void a(arg $$0, buf $$1) {
      if ($$1.bi()) {
         $$1.dX().a(cdi.X, bah.a);
      } else {
         $$1.dX().b(cdi.X);
      }
   }
}
