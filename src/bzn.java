import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bzn extends bzy<bpp> {
   @Override
   public Set<bys<?>> a() {
      return ImmutableSet.of(bys.X);
   }

   @Override
   protected void a(apf $$0, bpp $$1) {
      if ($$1.bc()) {
         $$1.dP().a(bys.X, axy.a);
      } else {
         $$1.dP().b(bys.X);
      }
   }
}
