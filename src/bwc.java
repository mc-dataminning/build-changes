import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwc extends bwm<bmf> {
   @Override
   public Set<bvh<?>> a() {
      return ImmutableSet.of(bvh.W);
   }

   @Override
   protected void a(amz $$0, bmf $$1) {
      if ($$1.aZ()) {
         $$1.dO().a(bvh.W, avm.a);
      } else {
         $$1.dO().b(bvh.W);
      }
   }
}
