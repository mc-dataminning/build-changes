import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdm extends cdx<btn> {
   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.X);
   }

   @Override
   protected void a(are $$0, btn $$1) {
      if ($$1.be()) {
         $$1.dS().a(ccr.X, baa.a);
      } else {
         $$1.dS().b(ccr.X);
      }
   }
}
