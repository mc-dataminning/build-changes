import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bvs extends bwc<blv> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.W);
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      if ($$1.aZ()) {
         $$1.dO().a(bux.W, avc.a);
      } else {
         $$1.dO().b(bux.W);
      }
   }
}
