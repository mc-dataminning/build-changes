import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bvb extends bvl<blg> {
   @Override
   public Set<buh<?>> a() {
      return ImmutableSet.of(buh.W);
   }

   @Override
   protected void a(ame $$0, blg $$1) {
      if ($$1.aZ()) {
         $$1.dP().a(buh.W, auo.a);
      } else {
         $$1.dP().b(buh.W);
      }
   }
}
