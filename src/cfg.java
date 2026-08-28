import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfg extends cfr<bvh> {
   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.X);
   }

   @Override
   protected void a(arp $$0, bvh $$1) {
      if ($$1.bj()) {
         $$1.eb().a(cel.X, bas.a);
      } else {
         $$1.eb().b(cel.X);
      }
   }
}
