import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bwh extends bwr<bmk> {
   @Override
   public Set<bvm<?>> a() {
      return ImmutableSet.of(bvm.W);
   }

   @Override
   protected void a(and $$0, bmk $$1) {
      if ($$1.aZ()) {
         $$1.dO().a(bvm.W, avr.a);
      } else {
         $$1.dO().b(bvm.W);
      }
   }
}
