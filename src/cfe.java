import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfe extends cfp<bvf> {
   @Override
   public Set<cej<?>> a() {
      return ImmutableSet.of(cej.X);
   }

   @Override
   protected void a(arc $$0, bvf $$1) {
      if ($$1.bj()) {
         $$1.ec().a(cej.X, bae.a);
      } else {
         $$1.ec().b(cej.X);
      }
   }
}
