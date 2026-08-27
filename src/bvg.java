import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bvg extends bvq<bll> {
   @Override
   public Set<bum<?>> a() {
      return ImmutableSet.of(bum.W);
   }

   @Override
   protected void a(ami $$0, bll $$1) {
      if ($$1.aZ()) {
         $$1.dP().a(bum.W, aus.a);
      } else {
         $$1.dP().b(bum.W);
      }
   }
}
