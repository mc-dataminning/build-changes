import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwl extends bww<bmo> {
   @Override
   public Set<bvq<?>> a() {
      return ImmutableSet.of(bvq.X);
   }

   @Override
   protected void a(ane $$0, bmo $$1) {
      if ($$1.aZ()) {
         $$1.dN().a(bvq.X, avt.a);
      } else {
         $$1.dN().b(bvq.X);
      }
   }
}
