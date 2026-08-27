import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwi extends bws<bml> {
   @Override
   public Set<bvn<?>> a() {
      return ImmutableSet.of(bvn.W);
   }

   @Override
   protected void a(and $$0, bml $$1) {
      if ($$1.aZ()) {
         $$1.dO().a(bvn.W, avs.a);
      } else {
         $$1.dO().b(bvn.W);
      }
   }
}
